package net.HyperialHub.Main.Utils;

import java.util.HashMap;
import java.util.UUID;

import net.HyperialHub.Main.Main;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class HashMapStorage implements Listener{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public HashMapStorage(Main listener) {
		this.plugin = listener;		
	}
	
	public static HashMap<UUID, Integer> Shards = new HashMap<UUID, Integer>();
	public static HashMap<UUID, Entity> Pet = new HashMap<UUID, Entity>();
	public static HashMap<UUID, String> PvP = new HashMap<UUID, String>();
	public static HashMap<UUID, Player> Announcements = new HashMap<UUID, Player>();
	public static HashMap<String, Integer> PlayerCount = new HashMap<String, Integer>();
	public static HashMap<UUID, Player> Parkour = new HashMap<UUID, Player>();
	
}
