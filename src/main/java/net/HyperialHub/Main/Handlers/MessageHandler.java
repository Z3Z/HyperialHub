package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class MessageHandler implements Listener{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public MessageHandler(Main listener) {
		this.plugin = listener;		
	}
	
	
	public static void broadcast1(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("             &eWant to pvp in the hub type &b/pvp" + "\n" + "       &eand click a team to join our custom pvp mode!"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
	
	public static void broadcast2(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("      &eWant to try our parkour then type &b/parkour start" + "\n" + "    &eto teleport to the parkour start, win and get rewarded!"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
	
	public static void broadcast3(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("          &eSign up on our website to get frequent" + "\n" + "       &eupdates and too see when a new game comes!"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
	
	public static void broadcast4(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("      &eLike our builds? Subscribe to the CastleCrafters on" + "\n" + "       &eyoutube at &bwww.youtube.com/TeamCastleCrafters"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
	
	public static void broadcast5(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("          &eWant to get someones attention in hub?" + "\n" + "       &ejust type their name and it will notify them!"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
	
	public static void broadcast6(){
		for(final Player p : Bukkit.getOnlinePlayers()){
			if(p != null){
				if(HashMapStorage.Announcements.containsKey(p.getUniqueId())){
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«" + "\n" + "                        &8&l<&5Hyperial&bMC&8&l>" + "\n" + " "));
					p.sendMessage(Util.color("           &eWant to have a better experience?" + "\n" + "       &eThen tell your friends about the server!"));
					Packets.createJson(p, Util.color("\n" + "&8&lClick Here To Toggle Announcements!"), Util.color("&8&l»&5&l&m---------------------------&r&8&l«" + "\n" + " " + "\n" + "&eClick me to turn announcements off!" + "\n" + "&eTurn them back on with &b/toggle!" + "\n" + " " + "\n" + "&8&l»&5&l&m---------------------------&r&8&l«"), "/toggle announcements");
					p.sendMessage(Util.color("&8&l»&5&l&m------------------------------------------&r&8&l«"));
				}
			}
		}
	}
}
