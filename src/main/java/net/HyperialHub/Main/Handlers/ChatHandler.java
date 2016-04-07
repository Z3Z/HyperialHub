package net.HyperialHub.Main.Handlers;

import java.util.ArrayList;
import java.util.List;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public ChatHandler(Main hub) {
		this.plugin = hub;
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		String msg = e.getMessage();

		String[] messages = msg.split(" ");
		List<String> players = new ArrayList<String>();
		for (Player p : Bukkit.getOnlinePlayers()) {
			players.add(p.getName());
		}

		for (String s : messages) {
			if (players.contains(s)) {
				e.setMessage(e.getMessage().replace(
						s,
						ChatColor.translateAlternateColorCodes('&', "&b@" + s
								+ "&e")));
				Bukkit.getPlayerExact(s).playSound(
						Bukkit.getPlayerExact(s).getLocation(),
						Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
			}
		}
		if(!(e.getMessage().contains("%"))){
		if(e.getPlayer().hasPermission("HyperialHub.chatcolor")){
			e.setFormat(Util.color("&5 " + e.getPlayer().getName() + " &8&l» " + "&e" + e.getMessage()));
		}else{
			e.setFormat(Util.color("&5 " + e.getPlayer().getName() + " &8&l» ") + ChatColor.YELLOW + e.getMessage());
		}
		}else{
			e.getPlayer().sendMessage(Util.color("&b&lNOTICE&8&l» &5An invalid character was sent in chat!"));
			e.setCancelled(true);
		}
	}

}
