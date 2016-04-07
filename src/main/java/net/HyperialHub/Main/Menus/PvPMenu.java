package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class PvPMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private Main plugin;
	public PvPMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lPvP Menu"));
		Border();
		RedTeam();
		BlueTeam();
		OrangeTeam();
		GreenTeam();
		RemoveArmor();
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
	
	public static void RedTeam(){
		ItemStack item = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&c&lRed Team"), Arrays.asList(Util.color(" "), Util.color("&eClick to join the red team and"), Util.color("&eenable pvp to brawl it out with"), Util.color("&eplayers in the hub for rewards!"), Util.color(" "), Util.color("&8Click to activate")));
		LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
		meta.setColor(Color.RED);
		item.setItemMeta(meta);
		inv.setItem(19, item);
	}
	
	public static void BlueTeam(){
		ItemStack item = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&1&lBlue Team"), Arrays.asList(Util.color(" "), Util.color("&eClick to join the blue team and"), Util.color("&eenable pvp to brawl it out with"), Util.color("&eplayers in the hub for rewards!"), Util.color(" "), Util.color("&8Click to activate")));
		LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
		meta.setColor(Color.BLUE);
		item.setItemMeta(meta);
		inv.setItem(21, item);
	}
	
	public static void OrangeTeam(){
		ItemStack item = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&6&lOrange Team"), Arrays.asList(Util.color(" "), Util.color("&eClick to join the orange team and"), Util.color("&eenable pvp to brawl it out with"), Util.color("&eplayers in the hub for rewards!"), Util.color(" "), Util.color("&8Click to activate")));
		LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
		meta.setColor(Color.ORANGE);
		item.setItemMeta(meta);
		inv.setItem(23, item);
	}
	
	public static void GreenTeam(){
		ItemStack item = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&2&lGreen Team"), Arrays.asList(Util.color(" "), Util.color("&eClick to join the green team and"), Util.color("&eenable pvp to brawl it out with"), Util.color("&eplayers in the hub for rewards!"), Util.color(" "), Util.color("&8Click to activate")));
		LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
		meta.setColor(Color.GREEN);
		item.setItemMeta(meta);
		inv.setItem(25, item);
	}
	
	public static void RemoveArmor(){
		ItemStack item = Util.createItem(Material.BARRIER, 1, 0, Util.color("&c&lQuit PVP"), Arrays.asList(Util.color(" "), Util.color("&eRemove yourself from the pvp"), Util.color("&eso you can either change"), Util.color("&eteams or go play a game!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(34, item);
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Util.color("&5&lPvP Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&c&lRed Team"))){
									e.setCancelled(true);
									p.closeInventory();
									if(!(HashMapStorage.PvP.containsKey(p.getUniqueId()))){
										HashMapStorage.PvP.put(p.getUniqueId(), "Red");
										ItemStack item = Util.createItem(Material.LEATHER_HELMET, 1, 0, Util.color("&c&lRed Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the red team!")));
										LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
										meta.setColor(Color.RED);
										item.setItemMeta(meta);
										ItemStack item1 = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&c&lRed Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the red team!")));
										LeatherArmorMeta meta1 = (LeatherArmorMeta)item1.getItemMeta();
										meta1.setColor(Color.RED);
										item1.setItemMeta(meta1);
										ItemStack item2 = Util.createItem(Material.LEATHER_LEGGINGS, 1, 0, Util.color("&c&lRed Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the red team!")));
										LeatherArmorMeta meta2 = (LeatherArmorMeta)item2.getItemMeta();
										meta2.setColor(Color.RED);
										item2.setItemMeta(meta2);
										ItemStack item3 = Util.createItem(Material.LEATHER_BOOTS, 1, 0, Util.color("&c&lRed Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the red team!")));
										LeatherArmorMeta meta3 = (LeatherArmorMeta)item3.getItemMeta();
										meta3.setColor(Color.RED);
										item3.setItemMeta(meta3);
										p.getInventory().setHelmet(item);
										p.getInventory().setChestplate(item1);
										p.getInventory().setLeggings(item2);
										p.getInventory().setBoots(item3);
									}else{
										p.sendMessage(Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eYou must type &b/pvp off &eor click" + "\n" + "&ethe barrier in the pvp menu &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"));
									}
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&1&lBlue Team"))){
									e.setCancelled(true);
									p.closeInventory();
									if(!(HashMapStorage.PvP.containsKey(p.getUniqueId()))){
										HashMapStorage.PvP.put(p.getUniqueId(), "Blue");
										ItemStack item = Util.createItem(Material.LEATHER_HELMET, 1, 0, Util.color("&1&lBlue Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the blue team!")));
										LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
										meta.setColor(Color.BLUE);
										item.setItemMeta(meta);
										ItemStack item1 = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&1&lBlue Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the blue team!")));
										LeatherArmorMeta meta1 = (LeatherArmorMeta)item1.getItemMeta();
										meta1.setColor(Color.BLUE);
										item1.setItemMeta(meta1);
										ItemStack item2 = Util.createItem(Material.LEATHER_LEGGINGS, 1, 0, Util.color("&1&lBlue Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the blue team!")));
										LeatherArmorMeta meta2 = (LeatherArmorMeta)item2.getItemMeta();
										meta2.setColor(Color.BLUE);
										item2.setItemMeta(meta2);
										ItemStack item3 = Util.createItem(Material.LEATHER_BOOTS, 1, 0, Util.color("&1&lBlue Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the blue team!")));
										LeatherArmorMeta meta3 = (LeatherArmorMeta)item3.getItemMeta();
										meta3.setColor(Color.BLUE);
										item3.setItemMeta(meta3);
										p.getInventory().setHelmet(item);
										p.getInventory().setChestplate(item1);
										p.getInventory().setLeggings(item2);
										p.getInventory().setBoots(item3);
									}else{
										p.sendMessage(Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eYou must type &b/pvp off &eor click" + "\n" + "&ethe barrier in the pvp menu &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"));
									}
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&6&lOrange Team"))){
									e.setCancelled(true);
									p.closeInventory();
									if(!(HashMapStorage.PvP.containsKey(p.getUniqueId()))){
										HashMapStorage.PvP.put(p.getUniqueId(), "Orange");
										ItemStack item = Util.createItem(Material.LEATHER_HELMET, 1, 0, Util.color("&6&lOrange Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the orange team!")));
										LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
										meta.setColor(Color.ORANGE);
										item.setItemMeta(meta);
										ItemStack item1 = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&6&lOrange Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the orange team!")));
										LeatherArmorMeta meta1 = (LeatherArmorMeta)item1.getItemMeta();
										meta1.setColor(Color.ORANGE);
										item1.setItemMeta(meta1);
										ItemStack item2 = Util.createItem(Material.LEATHER_LEGGINGS, 1, 0, Util.color("&6&lOrange Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the orange team!")));
										LeatherArmorMeta meta2 = (LeatherArmorMeta)item2.getItemMeta();
										meta2.setColor(Color.ORANGE);
										item2.setItemMeta(meta2);
										ItemStack item3 = Util.createItem(Material.LEATHER_BOOTS, 1, 0, Util.color("&6&lOrange Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the orange team!")));
										LeatherArmorMeta meta3 = (LeatherArmorMeta)item3.getItemMeta();
										meta3.setColor(Color.ORANGE);
										item3.setItemMeta(meta3);
										p.getInventory().setHelmet(item);
										p.getInventory().setChestplate(item1);
										p.getInventory().setLeggings(item2);
										p.getInventory().setBoots(item3);
									}else{
										p.sendMessage(Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eYou must type &b/pvp off &eor click" + "\n" + "&ethe barrier in the pvp menu &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"));
									}
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&2&lGreen Team"))){
									e.setCancelled(true);
									p.closeInventory();
									if(!(HashMapStorage.PvP.containsKey(p.getUniqueId()))){
										HashMapStorage.PvP.put(p.getUniqueId(), "Green");
										ItemStack item = Util.createItem(Material.LEATHER_HELMET, 1, 0, Util.color("&2&lGreen Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the green team!")));
										LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
										meta.setColor(Color.GREEN);
										item.setItemMeta(meta);
										ItemStack item1 = Util.createItem(Material.LEATHER_CHESTPLATE, 1, 0, Util.color("&2&lGreen Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the green team!")));
										LeatherArmorMeta meta1 = (LeatherArmorMeta)item1.getItemMeta();
										meta1.setColor(Color.GREEN);
										item1.setItemMeta(meta1);
										ItemStack item2 = Util.createItem(Material.LEATHER_LEGGINGS, 1, 0, Util.color("&2&lGreen Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the green team!")));
										LeatherArmorMeta meta2 = (LeatherArmorMeta)item2.getItemMeta();
										meta2.setColor(Color.GREEN);
										item2.setItemMeta(meta2);
										ItemStack item3 = Util.createItem(Material.LEATHER_BOOTS, 1, 0, Util.color("&2&lGreen Team"), Arrays.asList(Util.color(" "), Util.color("&eYou are on the green team!")));
										LeatherArmorMeta meta3 = (LeatherArmorMeta)item3.getItemMeta();
										meta3.setColor(Color.GREEN);
										item3.setItemMeta(meta3);
										p.getInventory().setHelmet(item);
										p.getInventory().setChestplate(item1);
										p.getInventory().setLeggings(item2);
										p.getInventory().setBoots(item3);
									}else{
										p.sendMessage(Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eYou must type &b/pvp off &eor click" + "\n" + "&ethe barrier in the pvp menu &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"));
									}
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BARRIER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&c&lQuit PVP"))){
									e.setCancelled(true);
									p.closeInventory();
									HashMapStorage.PvP.remove(p.getUniqueId());
									p.getInventory().setArmorContents(null);
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
