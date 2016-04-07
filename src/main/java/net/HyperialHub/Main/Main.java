package net.HyperialHub.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import net.HyperialHub.Main.Bungee.BUtil;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.CustomAPI.Particles;
import net.HyperialHub.Main.CustomAPI.Pets;
import net.HyperialHub.Main.Handlers.AnnouncementHandler;
import net.HyperialHub.Main.Handlers.BlockHandler;
import net.HyperialHub.Main.Handlers.BlockSpread;
import net.HyperialHub.Main.Handlers.BuildHandler;
import net.HyperialHub.Main.Handlers.ChatHandler;
import net.HyperialHub.Main.Handlers.CommandHandler;
import net.HyperialHub.Main.Handlers.DamageHandler;
import net.HyperialHub.Main.Handlers.DoubleJumpHandler;
import net.HyperialHub.Main.Handlers.DropHandler;
import net.HyperialHub.Main.Handlers.GadgetHandler;
import net.HyperialHub.Main.Handlers.HungerHandler;
import net.HyperialHub.Main.Handlers.ItemHandler;
import net.HyperialHub.Main.Handlers.JumpPadHandler;
import net.HyperialHub.Main.Handlers.MessageHandler;
import net.HyperialHub.Main.Handlers.ParkourHandler;
import net.HyperialHub.Main.Handlers.PetHandler;
import net.HyperialHub.Main.Handlers.PickupHandler;
import net.HyperialHub.Main.Handlers.ScoreBoardHandler;
import net.HyperialHub.Main.Handlers.WeatherHandler;
import net.HyperialHub.Main.Menus.CosmeticMenu;
import net.HyperialHub.Main.Menus.GadgetMenu;
import net.HyperialHub.Main.Menus.GameMenu;
import net.HyperialHub.Main.Menus.HatsMenu;
import net.HyperialHub.Main.Menus.ParticleMenu;
import net.HyperialHub.Main.Menus.PetsMenu;
import net.HyperialHub.Main.Menus.ProfileMenu;
import net.HyperialHub.Main.Menus.PvPMenu;
import net.HyperialHub.Main.Menus.ToggleMenu;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class Main extends JavaPlugin implements Listener, PluginMessageListener{
	
	public static String GetServer;
	public static String[] serverList;
	
	public void onEnable(){
		HashMapStorage.Pet.clear();
		Pets.PetUse.clear();
		HashMapStorage.Parkour.clear();
		HashMapStorage.PvP.clear();
		HashMapStorage.Announcements.clear();
		Listeners();
		Commands();
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	    console.sendMessage(Util.color("&5&lHyperial&b&lMC &8>> &aThe hub plugin has been enabled!"));
	    Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this,"BungeeCord");
	    Bukkit.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
		AnnouncementHandler.startAnnouncing();
		Bukkit.getWorld("world").setGameRuleValue("keepInventory", "true");
	}
	
	public void onDisable(){
		HashMapStorage.Pet.clear();
		Pets.PetUse.clear();
		HashMapStorage.Parkour.clear();
		HashMapStorage.PvP.clear();
		HashMapStorage.Announcements.clear();
		List<Entity> entities = Bukkit.getWorld("world").getEntities();
		for ( Entity entity : entities){
			entity.remove();
		}
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(Util.color("&5&lHyperial&b&lMC &8>> &cThe plugin has been disabled!"));
		for (Entry<UUID, Integer> entry : HashMapStorage.Shards.entrySet()) {
			getConfig().set(entry.getKey() + ".Shards", entry.getValue());
		}

		saveConfig();
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Util(this), this);
		pm.registerEvents(new Packets(this), this);
		pm.registerEvents(new HashMapStorage(this), this);
		pm.registerEvents(new PlayerJoin(this), this);
		pm.registerEvents(new PlayerQuit(this), this);
		pm.registerEvents(new BUtil(this), this);
		pm.registerEvents(new Shards(this), this);
		pm.registerEvents(new BuildHandler(this), this);
		pm.registerEvents(new ChatHandler(this), this);
		pm.registerEvents(new CommandHandler(this), this);
		pm.registerEvents(new DamageHandler(this), this);
		pm.registerEvents(new HungerHandler(this), this);
		pm.registerEvents(new ItemHandler(this), this);
		pm.registerEvents(new DoubleJumpHandler(this), this);
		pm.registerEvents(new ScoreBoardHandler(this), this);
		pm.registerEvents(new GameMenu(this), this);
		pm.registerEvents(new ProfileMenu(this), this);
		pm.registerEvents(new GadgetMenu(this), this);
		pm.registerEvents(new CosmeticMenu(this), this);
		pm.registerEvents(new DropHandler(this), this);
		pm.registerEvents(new GadgetHandler(this), this);
		pm.registerEvents(new PickupHandler(this), this);
		pm.registerEvents(new ParticleMenu(this), this);
		pm.registerEvents(new Particles(this), this);
		pm.registerEvents(new WeatherHandler(this), this);
		pm.registerEvents(new PetsMenu(this), this);
		pm.registerEvents(new Pets(this), this);
		pm.registerEvents(new PetHandler(this), this);
		pm.registerEvents(new BlockSpread(this), this);
		pm.registerEvents(new JumpPadHandler(this), this);
		pm.registerEvents(new MessageHandler(this), this);
		pm.registerEvents(new AnnouncementHandler(this), this);
		pm.registerEvents(new ToggleMenu(this), this);
		pm.registerEvents(new HatsMenu(this), this);
		pm.registerEvents(new PvPMenu(this), this);
		pm.registerEvents(new BlockHandler(this), this);
		pm.registerEvents(new ParkourHandler(this), this);
	}
	
	public void Commands(){
		getCommand("toggle").setExecutor(new CommandHandler(this));
		getCommand("pvp").setExecutor(new CommandHandler(this));
		getCommand("parkour").setExecutor(new CommandHandler(this));
	}

	public void onPluginMessageReceived(String channel, Player player, byte[] message) {
	    if (!channel.equals("BungeeCord")) {
	      return;
	    }
	    try{
	    	DataInputStream in = new DataInputStream(new ByteArrayInputStream(message));
		    String subchannel = in.readUTF();
	    if (subchannel.equals("PlayerCount")) {
	    	String PlayerCountServer = in.readUTF();
	    	Integer playercount = in.readInt();
	    	HashMapStorage.PlayerCount.remove(PlayerCountServer);
	    	HashMapStorage.PlayerCount.put(PlayerCountServer, playercount);
        } else if (subchannel.equals("GetServers")) {
        	serverList = in.readUTF().split("\n");
        } else if (subchannel.equals("GetServer")) {
            // Example: GetServer subchannel
        	GetServer = in.readUTF();
        }
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	  }
}
