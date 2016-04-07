package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Menus.CosmeticMenu;
import net.HyperialHub.Main.Menus.GadgetMenu;
import net.HyperialHub.Main.Menus.GameMenu;
import net.HyperialHub.Main.Menus.ProfileMenu;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public ItemHandler(Main hub) {
		this.plugin = hub;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void gamemenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.COMPASS) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lGame Selector &e- &b&lRight Click"))){
							GameMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void profile(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.SKULL_ITEM) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lProfile &e- &b&lRight Click"))){
							ProfileMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void noGadget(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.STAINED_GLASS_PANE) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&c&lNo Gadget Selected"))){
							e.setCancelled(true);
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void gadgetmenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.CHEST) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lGadgets &e- &b&lRight Click"))){
							GadgetMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void cosmeticmenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.NAME_TAG) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lCosmetics &e- &b&lRight Click"))){
							CosmeticMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
}