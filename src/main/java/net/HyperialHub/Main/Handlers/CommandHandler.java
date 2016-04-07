package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Menus.PvPMenu;
import net.HyperialHub.Main.Menus.ToggleMenu;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CommandHandler implements Listener, CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;

	public CommandHandler(Main hub) {
		this.plugin = hub;
	}

	public boolean onCommand(CommandSender sender, Command command,
			String alias, String[] args) {
		Player player = (Player) sender;
		if(sender.equals(player)){
		
		if (alias.equalsIgnoreCase("toggle")){
			if(args.length >= 2 || args.length < 1 || args.equals(null)){
				ToggleMenu.Menu(player);
			}else if(args[0].equalsIgnoreCase("announcements")){
				if(HashMapStorage.Announcements.containsKey(player.getUniqueId())){
					HashMapStorage.Announcements.remove(player.getUniqueId());
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eYou have &cdisabled &eannouncements!" + "\n" + "       &eYou can turn them on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}else if(!(HashMapStorage.Announcements.containsKey(player.getUniqueId()))){
					HashMapStorage.Announcements.put(player.getUniqueId(), player);
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eYou have &aenabled &eannouncements!" + "\n" + "       &eYou can turn them off with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}
			}
		}
		
		if (alias.equalsIgnoreCase("parkour")){
			if(args.length >= 2 || args.length < 1 || args.equals(null)){
				player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eWant to try out the parkour then" + "\n" + "       &ehead over by typing &b/parkour start!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
			}else if(args[0].equalsIgnoreCase("leave")){
				if(HashMapStorage.Parkour.containsKey(player.getUniqueId())){
					HashMapStorage.Parkour.remove(player.getUniqueId());
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eYou have &cdisabled &eparkour mode!" + "\n" + "       &eYou can rejoin by typing &b/parkour start!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}else if(!(HashMapStorage.Parkour.containsKey(player.getUniqueId()))){
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "         &eYou are not in parkour mode!" + "\n" + "       &eYou can join parkour by typing &b/parkour start!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}
			}else if(args[0].equalsIgnoreCase("start")){
				Location loc = new Location(Bukkit.getWorld("world"), -134.5, 43, 1005.5, 180, 0);
				player.teleport(loc);
				player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "        &eTeleported to &aParkour start &ewalk" + "\n" + "       &eon the pressure plate to join parkour!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
			}
		}
		
		if (alias.equalsIgnoreCase("pvp")){
			if(args.length >= 2 || args.length < 1 || args.equals(null)){
				PvPMenu.Menu(player);
			}else if(args[0].equalsIgnoreCase("off")){
				if(HashMapStorage.PvP.containsKey(player.getUniqueId())){
					player.getInventory().setArmorContents(null);
					HashMapStorage.PvP.remove(player.getUniqueId());
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "          &eYou have &cdisabled &epvp!" + "\n" + "       &eYou can turn it back on with &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}else{
					player.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "    &ePVP is currently &cdisabled &efor you!" + "\n" + "       &eYou can turn it back on with &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}
			}
			}
		
		
		return true;
	}else{
		sender.sendMessage(Util.color("&c&lYoure not allowed to execute that command!"));
	}
		return true;
	}

}
