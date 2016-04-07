package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ParkourHandler implements Listener{

	@SuppressWarnings("unused")
	private Main plugin;

	public ParkourHandler(Main hub) {
		this.plugin = hub;
	}
	
	@EventHandler
	public void onLaunch(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(p.getLocation().getWorld().getBlockAt(p.getLocation()).getType() == Material.IRON_PLATE){
			if(!(HashMapStorage.Parkour.containsKey(p.getUniqueId()))){
			HashMapStorage.Parkour.put(p.getUniqueId(), p);
			p.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eYou have entered parkour mode use" + "\n" + "       &b/parkour start &eto get back to the start!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
			}
		}else if(p.getLocation().getWorld().getBlockAt(p.getLocation()).getType() == Material.GOLD_PLATE){
			if(HashMapStorage.Parkour.containsKey(p.getUniqueId())){
			HashMapStorage.Parkour.remove(p.getUniqueId());
			p.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eCongrats on completing the parkour!" + "\n" + "       &eYou can do it again by typing &b/parkour start!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
		}
		}
		}
}
