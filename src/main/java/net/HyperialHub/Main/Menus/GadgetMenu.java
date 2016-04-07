package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.PlayerJoin;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GadgetMenu implements Listener{
	
	public static Inventory inv;
	
	private Main plugin;
	public GadgetMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lGadget Menu"));
		Border();
		Grenade();
		CoinBomb();
		RemoveGadgets();
		p.openInventory(inv);
	}
	
	public static void Border(){
		ItemStack border = Util.createItem(Material.STAINED_GLASS_PANE, 1, 15, Util.color(" "), null);
		inv.setItem(0, border);
		inv.setItem(1, border);
		inv.setItem(2, border);
		inv.setItem(3, border);
		inv.setItem(4, border);
		inv.setItem(5, border);
		inv.setItem(6, border);
		inv.setItem(7, border);
		inv.setItem(8, border);
		inv.setItem(9, border);
		inv.setItem(17, border);
		inv.setItem(18, border);
		inv.setItem(26, border);
		inv.setItem(27, border);
		inv.setItem(35, border);
		inv.setItem(36, border);
		inv.setItem(37, border);
		inv.setItem(38, border);
		inv.setItem(39, border);
		inv.setItem(40, border);
		inv.setItem(41, border);
		inv.setItem(42, border);
		inv.setItem(43, border);
		inv.setItem(44, border);
	}
	
	public static void Grenade(){
		ItemStack gadget = Util.createItem(Material.MAGMA_CREAM, 1, 0, Util.color("&5&lGrenade"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b250 Shards"), Util.color("&eThrow a grenade around in"), Util.color("&ethe lobby and make explosions"), Util.color("&eanywhere you throw it!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(21, gadget);
	}
	
	public static void CoinBomb(){
		ItemStack gadget = Util.createItem(Material.PRISMARINE_SHARD, 1, 0, Util.color("&5&lShardBomb"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b500 Shards"), Util.color("&eThrow a shardbomb in the lobby"), Util.color("&eand watch as shards spew out"), Util.color("&eof the bomb for people to grab!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(23, gadget);
	}
	
	public static void RemoveGadgets(){
		ItemStack gadget = Util.createItem(Material.BARRIER, 1, 0, Util.color("&c&lRemove Gadgets"), Arrays.asList(Util.color(" "), Util.color("&eCost: &bNo Cost"), Util.color("&eRemove any active gadgets from"), Util.color("&eyour inventory and replace it"), Util.color("&ewith no gadget glass pane!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(34, gadget);
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		final Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Util.color("&5&lGadget Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.MAGMA_CREAM)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lGrenade"))){
									e.setCancelled(true);
									p.getInventory().clear();
									PlayerJoin.giveItems(p);
									p.getInventory().setItem(4, Util.createItem(Material.MAGMA_CREAM, 1, 0, Util.color("&5&lGrenade &e- &b&lRight Click"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b250 Coins"), Util.color("&eThrow a grenade around in"), Util.color("&ethe lobby and make explosions"), Util.color("&eanywhere you throw it!"), Util.color(" "), Util.color("&8Click to activate"))));
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
										public void run() {
											p.updateInventory();
										}
									}, 5L);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.PRISMARINE_SHARD)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lShardBomb"))){
									e.setCancelled(true);
									p.getInventory().clear();
									PlayerJoin.giveItems(p);
									p.getInventory().setItem(4, Util.createItem(Material.PRISMARINE_SHARD, 1, 0, Util.color("&5&lShardBomb &e- &b&lRight Click"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b500 Shards"), Util.color("&eThrow a shardbomb in the lobby"), Util.color("&eand watch as shards spew out"), Util.color("&eof the bomb for people to grab!"), Util.color(" "), Util.color("&8Click to activate"))));
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
										public void run() {
											p.updateInventory();
										}
									}, 5L);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BARRIER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&c&lRemove Gadgets"))){
									e.setCancelled(true);
									p.getInventory().clear();
									PlayerJoin.giveItems(p);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
										public void run() {
											p.updateInventory();
										}
									}, 5L);
								}
							}
							
							
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color(" "))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
						}else{
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
						}
					}else{
						e.setCancelled(true);
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
					}
				}else{
					e.setCancelled(true);
				}
			}else{
				e.setCancelled(true);
			}
		}
	}

}
