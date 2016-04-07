package net.HyperialHub.Main.CustomAPI;

import java.util.HashMap;
import java.util.UUID;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Handlers.PetHandler;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Horse.Variant;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class Pets implements Listener {
	private static Main plugin;

	public Pets(Main hub) {
		Pets.plugin = hub;
	}

	public final static HashMap<UUID, Entity> PetUse = new HashMap<UUID, Entity>();
	public static HashMap<UUID, BukkitTask> tasks2 = new HashMap<UUID, BukkitTask>();

	public static void createSteed(Player p) {
		Player player = (Player) p;
		UUID uuid = player.getUniqueId();
		if (PetUse.containsKey(uuid)) {
			player.sendMessage(Util.color("&b&lPETS&8&l» &5You may only have one pet at a time!"));
			return;
		} else {
			final Horse horse = (Horse) player.getLocation().getWorld()
					.spawn(player.getLocation(), Horse.class);
			horse.setCustomName(Util.color("&e" + p.getName() + "&e's &cBlazing Steed"));
			horse.setCustomNameVisible(true);
			horse.setAdult();
			horse.setTarget(player);
			horse.setVariant(Variant.SKELETON_HORSE);
			PetUse.put(uuid, horse);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			tasks2.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					horse.getWorld().playEffect(horse.getLocation(),
							Effect.LAVA_POP, Integer.MAX_VALUE);
					horse.getWorld().playEffect(horse.getLocation(),
							Effect.FLAME, Integer.MAX_VALUE);
				}
			}, 0, 10L));
			PetHandler.petfollow(player, horse, 2.0);
		}
	}

	public static void createMusicalPiggy(Player p) {
		final Player player = (Player) p;
		UUID uuid = player.getUniqueId();
		if (PetUse.containsKey(uuid)) {
			player.sendMessage(Util.color("&b&lPETS&8&l» &5You may only have one pet at a time!"));
			return;
		} else {
			final Pig Mp = (Pig) player.getLocation().getWorld()
					.spawn(player.getLocation(), Pig.class);
			Mp.setCustomName(Util.color("&e" + p.getName() + "&e's &cMusical Pig"));
			Mp.setCustomNameVisible(true);
			Mp.setBaby();
			Mp.setTarget(player);
			Mp.setAgeLock(true);
			PetUse.put(uuid, Mp);
			BukkitScheduler scheduler4 = Bukkit.getServer().getScheduler();
			tasks2.put(uuid, scheduler4.runTaskTimer(plugin, new Runnable() {
				public void run() {
					Mp.getWorld().playEffect(Mp.getLocation().add(0, 1, 0),
							Effect.NOTE, Integer.MAX_VALUE);
					player.playSound(Mp.getLocation(), Sound.BLOCK_NOTE_PLING,
							Integer.valueOf((int) 1), Integer.valueOf((int) 1));
				}
			}, 0, 100L));
			PetHandler.petfollow(player, Mp, 1.6);
		}
	}

	public static void createMinion(Player p) {
		Player player = (Player) p;
		UUID uuid = player.getUniqueId();
		if (PetUse.containsKey(uuid)) {
			player.sendMessage(Util.color("&b&lPETS&8&l» &5You may only have one pet at a time!"));
			return;
		} else {
			final Villager minion = (Villager) player.getLocation().getWorld()
					.spawn(player.getLocation(), Villager.class);
			minion.setCustomName(Util.color("&e" + p.getName() + "&e's &cMinion"));
			minion.setCustomNameVisible(true);
			minion.setBaby();
			minion.setTarget(player);
			minion.setAgeLock(true);
			PetHandler.petfollow(player, minion, 0.8);
			PetUse.put(uuid, minion);
		}
	}
	
	public static void createRainbowSheep(Player p) {
		Player player = (Player) p;
		UUID uuid = player.getUniqueId();
		if (PetUse.containsKey(uuid)) {
			player.sendMessage(Util.color("&b&lPETS&8&l» &5You may only have one pet at a time!"));
			return;
		} else {
			final Sheep Rs = (Sheep) player.getLocation().getWorld()
					.spawn(player.getLocation(), Sheep.class);
			Rs.setCustomName(Util.color("&e" + p.getName() + "&e's &cRainbow Sheep"));
			Rs.setCustomNameVisible(true);
			Rs.setBaby();
			Rs.setAgeLock(true);
			Rs.setTarget(player);
			PetUse.put(uuid, Rs);
			final BukkitScheduler scheduler4 = Bukkit.getServer().getScheduler();
			tasks2.put(uuid, scheduler4.runTaskTimer(plugin, new Runnable() {
				public void run() {
					Rs.setHealth(8.0D);
					Rs.setBaby();
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.LIGHT_BLUE);
						}
					}, 0L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.CYAN);
						}
					}, 10L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.BLUE);
						}
					}, 20L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.GREEN);
						}
					}, 30L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.LIME);
						}
					}, 40L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.MAGENTA);
						}
					}, 50L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.PINK);
						}
					}, 60L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.PURPLE);
						}
					}, 70L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.BLUE);
						}
					}, 80L);
					scheduler4.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Rs.setColor(DyeColor.CYAN);
						}
					}, 90L);
				}
			}, 0, 100L));
			PetHandler.petfollow(player, Rs, 1.8);
		}
	}
	
	@EventHandler
	public void onPetEatGrass(EntityChangeBlockEvent e) {
	EntityType a = EntityType.SHEEP;
	EntityType b = EntityType.SHEEP;
	if (e.getEntity().getType() == a || e.getEntity().getType() == b) {
	e.setCancelled(true);
	}
	}

}
