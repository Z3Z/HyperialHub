package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
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

public class CosmeticMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private Main plugin;
	public CosmeticMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lCosmetic Menu"));
		Border();
		Particles();
		Hats(p);
		Wardrobe();
		Pets();
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
	
	public static void Particles(){
		ItemStack item = Util.createItem(Material.BLAZE_POWDER, 1, 0, Util.color("&5&lParticles"), Arrays.asList(Util.color(" "), Util.color("&eClick to browse the list of"), Util.color("&eparticles we offer and"), Util.color("&econsider purchasing some with shards!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(19, item);
	}
	
	public static void Hats(Player p){
		ItemStack item = Util.createSkull("Pokemon", Util.color("&5&lHats"), Arrays.asList(Util.color(" "), Util.color("&eBrowse our list of stylish"), Util.color("&eand goofy hats to collect"), Util.color("&eand compete with your friends!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(21, item);
	}
	
	public static void Wardrobe(){
		ItemStack item = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&5&lWardrobe"), Arrays.asList(Util.color(" "), Util.color("&eClick to browse the list"), Util.color("&eof clothes that you can"), Util.color("&epurchase using the shards system!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(23, item);
	}
	
	public static void Pets(){
		ItemStack item = Util.createItem(Material.BONE, 1, 0, Util.color("&5&lPets"), Arrays.asList(Util.color(" "), Util.color("&eClick to browse the list"), Util.color("&eof pets that you can"), Util.color("&epurchase using the shards system!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(25, item);
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Util.color("&5&lCosmetic Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.BLAZE_POWDER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lParticles"))){
									e.setCancelled(true);
									ParticleMenu.Menu(p);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lHats"))){
									e.setCancelled(true);
									HatsMenu.Menu(p);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lWardrobe"))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BONE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lPets"))){
									e.setCancelled(true);
									PetsMenu.Menu(p);
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
