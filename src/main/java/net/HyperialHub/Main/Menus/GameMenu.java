package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Bungee.BUtil;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GameMenu implements Listener{
	
	public static Inventory inv;
	@SuppressWarnings("unused")
	private static Main plugin;
	public GameMenu(Main listener) {
		GameMenu.plugin = listener;	
	}
	
	public static void Menu(final Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lGame Menu"));
		Border();
        Prison(p);
		Factions(p);
		KitPvP(p);
		Creative(p);
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
	
	
	public static void Prison(Player p){
		ItemStack item = Util.createItem(Material.DIAMOND_PICKAXE, 1, 0, Util.color("&5&lPrison"), Arrays.asList(Util.color(" "), Util.color("&eMine your way to freedom"), Util.color("&ein this intense gamemode"), Util.color("&ewhere mines hold you back."), Util.color(" "), Util.color("&b▶ Click to connect")));
        ItemMeta itemmeta = item.getItemMeta();
        itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(itemmeta);
        inv.setItem(19, item); 
	}

	
	public static void Factions(final Player p){
		ItemStack item = Util.createItem(Material.TNT, 1, 0, Util.color("&5&lFactions"), Arrays.asList(Util.color(" "), Util.color("&eJoin the world of raids"), Util.color("&ewith alliances, enemies and"), Util.color("&eloads of bases to conquer."), Util.color(" "), Util.color("&b▶ Click to connect")));
		inv.setItem(21, item);
	}
	
	public static void KitPvP(final Player p){
		ItemStack item = Util.createItem(Material.DIAMOND_SWORD, 1, 0, Util.color("&5&lKitPvP"), Arrays.asList(Util.color(" "), Util.color("&eFight others in an arena"), Util.color("&etype gamemode to earn some"), Util.color("&ecool custom gear and items."), Util.color(" "), Util.color("&b▶ Click to connect")));
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(itemmeta);
		inv.setItem(23, item);
	}
	
	public static void Creative(final Player p){
		ItemStack item = Util.createItem(Material.BOOK_AND_QUILL, 1, 0, Util.color("&5&lCreative"), Arrays.asList(Util.color(" "), Util.color("&eTake a breather relax and"), Util.color("&ebuild or build to try and"), Util.color("&eimpress us with your skills."), Util.color(" "), Util.color("&b▶ Click to connect")));
		inv.setItem(25, item);
		
	}
	
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Util.color("&5&lGame Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.DIAMOND_PICKAXE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lPrison"))){
									e.setCancelled(true);
									BUtil.sendToServer(p, "Prison");
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.TNT)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lFactions"))){
									e.setCancelled(true);
									BUtil.sendToServer(p, "Factions");
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lKitPvP"))){
									e.setCancelled(true);
									BUtil.sendToServer(p, "KitPvP");
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BOOK_AND_QUILL)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lCreative"))){
									e.setCancelled(true);
									BUtil.sendToServer(p, "Creative");
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
