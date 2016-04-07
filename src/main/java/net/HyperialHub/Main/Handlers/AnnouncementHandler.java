package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class AnnouncementHandler implements Listener{
	
	private static Main plugin;

	public AnnouncementHandler(Main hub) {
		AnnouncementHandler.plugin = hub;
	}
	
	public static void startAnnouncing(){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
    		public void run() {
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast1();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 0);
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast2();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 60);
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast3();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 120);
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast4();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 180);
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast5();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 240);
    				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		    		public void run() {
    		    			MessageHandler.broadcast6();
    		    			Bukkit.getServer().getConsoleSender().sendMessage(Util.color("&eAnnounceMent Sent!"));
    		    		}
    		    	}, 20 * 300);
    		}
    	}, 0, 20 * 360);
	}

}
