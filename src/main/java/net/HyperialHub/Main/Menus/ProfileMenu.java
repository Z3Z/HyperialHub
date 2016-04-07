package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Bungee.BUtil;
import net.HyperialHub.Main.CustomAPI.Pets;
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

public class ProfileMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private Main plugin;
	public ProfileMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lProfile Menu"));
		Border();
		PlayerStats(p);
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
	
	public static void PlayerStats(Player p){
		Integer slotNumber = 22;
		if(p.isOp() && Pets.PetUse.containsKey(p.getUniqueId())){
			ItemStack PlayerStats = Util.createSkull(p.getName(), Util.color("&5&lCharacter Information"), Arrays.asList(Util.color(" "), Util.color("&eUsername: &a" + p.getName()), Util.color("&eShards: &b" + HashMapStorage.Shards.get(p.getUniqueId()).toString()), Util.color("&eServer: &b" + BUtil.getServer(p)), Util.color("&eGamemode: &b" + p.getGameMode()), Util.color("&eActivePet: &aYes"), Util.color("&eOperator: &aYes"), Util.color(" "), Util.color("&8Click to view website link")));
			inv.setItem(slotNumber, PlayerStats);
		}else if(Pets.PetUse.containsKey(p.getUniqueId()) && !(p.isOp())){
			ItemStack PlayerStats = Util.createSkull(p.getName(), Util.color("&5&lCharacter Information"), Arrays.asList(Util.color(" "), Util.color("&eUsername: &a" + p.getName()), Util.color("&eShards: &b" + HashMapStorage.Shards.get(p.getUniqueId()).toString()), Util.color("&eServer: &b" + BUtil.getServer(p)), Util.color("&eGamemode: &b" + p.getGameMode()), Util.color("&eActivePet: &aYes"), Util.color("&eOperator: &cNo"), Util.color(" "), Util.color("&8Click to view website link")));
			inv.setItem(slotNumber, PlayerStats);
		}else if(p.isOp() && !(Pets.PetUse.containsKey(p.getUniqueId()))){
			ItemStack PlayerStats = Util.createSkull(p.getName(), Util.color("&5&lCharacter Information"), Arrays.asList(Util.color(" "), Util.color("&eUsername: &a" + p.getName()), Util.color("&eShards: &b" + HashMapStorage.Shards.get(p.getUniqueId()).toString()), Util.color("&eServer: &b" + BUtil.getServer(p)), Util.color("&eGamemode: &b" + p.getGameMode()), Util.color("&eActivePet: &cNo"), Util.color("&eOperator: &aYes"), Util.color(" "), Util.color("&8Click to view website link")));
			inv.setItem(slotNumber, PlayerStats);
		}else if(!(p.isOp()) && !(Pets.PetUse.containsKey(p.getUniqueId()))){
			ItemStack PlayerStats = Util.createSkull(p.getName(), Util.color("&5&lCharacter Information"), Arrays.asList(Util.color(" "), Util.color("&eUsername: &a" + p.getName()), Util.color("&eShards: &b" + HashMapStorage.Shards.get(p.getUniqueId()).toString()), Util.color("&eServer: &b" + BUtil.getServer(p)), Util.color("&eGamemode: &b" + p.getGameMode()), Util.color("&eActivePet: &cNo"), Util.color("&eOperator: &cNo"), Util.color(" "), Util.color("&8Click to view website link")));
			inv.setItem(slotNumber, PlayerStats);
		}
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Util.color("&5&lProfile Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							
							if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lCharacter Information"))){
									e.setCancelled(true);
									p.sendMessage(Util.color("&b&lWEBSITE&8&l� &5www.HyperialMC.Net"));
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							//BORDER
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
