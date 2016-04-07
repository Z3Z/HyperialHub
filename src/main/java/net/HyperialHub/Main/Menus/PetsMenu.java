package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.Utils.HashMapStorage;
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

public class PetsMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private Main plugin;
	public PetsMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lPets Menu"));
		Border();
		steed();
		RemovePets();
		musicalPiggy();
		minion();
		rainbowSheep();
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
	
	public static void steed(){
		ItemStack item = Util.createItem(Material.BONE, 1, 0, Util.color("&5&lBlazing Steed"), null);
		inv.setItem(10, item);
	}
	
	public static void musicalPiggy(){
		ItemStack item = Util.createItem(Material.PORK, 1, 0, Util.color("&5&lMusical Piggy"), null);
		inv.setItem(11, item);
	}
	
	public static void minion(){
		ItemStack item = Util.createItem(Material.EMERALD, 1, 0, Util.color("&5&lMinion"), null);
		inv.setItem(12, item);
	}
	
	public static void rainbowSheep(){
		ItemStack item = Util.createItem(Material.NOTE_BLOCK, 1, 0, Util.color("&5&lRainbow Sheep"), null);
		inv.setItem(13, item);
	}
	
	public static void RemovePets(){
		ItemStack item = Util.createItem(Material.BARRIER, 1, 0, Util.color("&c&lRemove Pets"), Arrays.asList(Util.color(" "), Util.color("&eCost: &bNo Cost"), Util.color("&eRemove any active pets from"), Util.color("&eyou and the map so you"), Util.color("&edont have a friendly companion!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(34, item);
	}
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		Integer cost = 500;
		Integer shards = HashMapStorage.Shards.get(p.getUniqueId()).intValue();
		if(e.getInventory().getName().equals(Util.color("&5&lPets Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.BONE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lBlazing Steed"))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										//Pets.createSteed(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
								}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.PORK)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lMusical Piggy"))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										//Pets.createMusicalPiggy(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
								}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.EMERALD)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lMinion"))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										//Pets.createMinion(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
								}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.NOTE_BLOCK)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lRainbow Sheep"))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										//Pets.createRainbowSheep(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
								}
								}
							}
							
							
								if(e.getCurrentItem().getType().equals(Material.BARRIER)){
									if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&c&lRemove Pets"))){
										e.setCancelled(true);
										//PetHandler.removePets(p);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
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
