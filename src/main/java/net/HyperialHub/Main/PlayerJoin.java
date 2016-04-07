package net.HyperialHub.Main;

import java.util.Arrays;

import net.HyperialHub.Main.Handlers.ScoreBoardHandler;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;


public class PlayerJoin implements Listener{
	
	private Main plugin;
	public PlayerJoin(Main listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		
		p.getInventory().setArmorContents(null);
		e.setJoinMessage(Util.color("&a&lJOIN &8&l» &b" + e.getPlayer().getName()));
		HashMapStorage.Announcements.put(p.getUniqueId(), p);
		
		e.getPlayer().setFoodLevel(20);
		Packets.sendTitle(e.getPlayer(), Util.color("&5&lHyperial&b&lMC"), Util.color("&8&lIN DEVELOPMENT"));
		
		Location loc = new Location(Bukkit.getWorld("world"), -196.5, 8, 960.5, -90, 0);
		e.getPlayer().teleport(loc);
		e.getPlayer().getInventory().clear();
		
		PlayerJoin.giveItems(p);
		
		if(p.hasPlayedBefore() == false){
			Location loc1 = new Location(Bukkit.getWorld("world"), -196.5, 8, 960.5, -90, 0);
			e.getPlayer().teleport(loc1);
			HashMapStorage.Announcements.put(p.getUniqueId(), p);
			e.getPlayer().getInventory().clear();
			PlayerJoin.giveItems(p);
			Bukkit.getServer().broadcastMessage(Util.color("&b&lNOTICE&8&l» &5Welcome &e" + p.getName() + " &5to the server! &b(&eNEW&b)"));
		}
		
		ScoreBoardHandler.makeScoreBoard(e.getPlayer());
		
		if (!plugin.getConfig().contains(p.getUniqueId().toString())) {
			plugin.getConfig().set(p.getUniqueId() + ".Shards", 0);
			HashMapStorage.Shards.put(p.getUniqueId(), 0);
		} else {
			HashMapStorage.Shards.put(p.getUniqueId(), plugin.getConfig().getInt(p.getUniqueId() + ".Shards"));
		}
	}
	
	public static void giveItems(Player p){
		ItemStack selector = Util.createItem(Material.COMPASS,1,0,Util.color("&5&lGame Selector &e- &b&lRight Click"), Arrays.asList(Util.color("&b&lLORE")));
		ItemStack profile = Util.createSkull(p.getName(), Util.color("&5&lProfile &e- &b&lRight Click"), Arrays.asList(Util.color("&b&lLORE")));
		ItemStack noGadget = Util.createItem(Material.STAINED_GLASS_PANE,1,14,Util.color("&c&lNo Gadget Selected"), Arrays.asList(Util.color("&b&lLORE")));
		ItemStack gadgets = Util.createItem(Material.CHEST,1,0,Util.color("&5&lGadgets &e- &b&lRight Click"), Arrays.asList(Util.color("&b&lLORE")));
		ItemStack cosmetics = Util.createItem(Material.NAME_TAG,1,0,Util.color("&5&lCosmetics &e- &b&lRight Click"), Arrays.asList(Util.color("&b&lLORE")));
		
		p.getInventory().setItem(0, selector);
		p.getInventory().setItem(2, profile);
		p.getInventory().setItem(4, noGadget);
		p.getInventory().setItem(6, gadgets);
		p.getInventory().setItem(8, cosmetics);
	}

}
