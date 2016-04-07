package net.HyperialHub.Main;

import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public PlayerQuit(Main listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		e.setQuitMessage(Util.color("&4&lQUIT &8&l» &b" + e.getPlayer().getName()));
		HashMapStorage.PvP.remove(e.getPlayer().getUniqueId());
		e.getPlayer().getInventory().setArmorContents(null);
	}

}
