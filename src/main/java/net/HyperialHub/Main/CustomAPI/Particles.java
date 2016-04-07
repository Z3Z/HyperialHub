package net.HyperialHub.Main.CustomAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class Particles implements Listener{
	private static Main plugin;

	public Particles(Main hub) {
		Particles.plugin = hub;
	}

	public static List<Player> ParticleUse = new ArrayList<Player>();
	public static HashMap<UUID, BukkitTask> ParticleTask = new HashMap<UUID, BukkitTask>();

	public static void MobSpawner(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, Integer.MAX_VALUE);
				}
			}, 0, 10L));
		}
	}
	public static void LavaPop(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.LAVA_POP, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.LAVA_POP, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.LAVA_POP, Integer.MAX_VALUE);
				}
			}, 0, 10L));
		}
	}
	public static void WitchMagic(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getEyeLocation().add(0, 0.5, 0), Effect.WITCH_MAGIC, Integer.MAX_VALUE);
				}
			}, 0, 10L));
		}
	}
	public static void FireWorkSpark(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.FIREWORKS_SPARK, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.FIREWORKS_SPARK, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.FIREWORKS_SPARK, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.FIREWORKS_SPARK, Integer.MAX_VALUE);
				}
			}, 0, 5L));
		}
	}
	public static void Enchanting(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation().add(0, 1, 0), Effect.FLYING_GLYPH, Integer.MAX_VALUE);
				}
			}, 0, 5L));
		}
	}
	public static void Rainbow(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location2 = player.getEyeLocation();
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location2.add(x, -0.66, z);
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location2, Effect.COLOURED_DUST, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.COLOURED_DUST, 100, 100);
	                    location2.subtract(x, -0.66, z);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 10L));
		}
	}
	public static void Portal(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
					player.getWorld().playEffect(player.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
				}
			}, 0, 2L));
		}
	}
	public static void End(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
					player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, Integer.MAX_VALUE);
				}
			}, 0, 2L));
		}
	}
	public static void Heart(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location3, Effect.HEART, 100, 100);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 20L));
		}
	}
	public static void Bedrock(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location2 = player.getEyeLocation();
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location2.add(x, -0.66, z);
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location2, Effect.VOID_FOG, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.VOID_FOG, 100, 100);
	                    player.getWorld().playEffect(location2, Effect.VOID_FOG, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.VOID_FOG, 100, 100);
	                    player.getWorld().playEffect(location2, Effect.VOID_FOG, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.VOID_FOG, 100, 100);
	                    location2.subtract(x, -0.66, z);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 15L));
		}
	}
	public static void Villager(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location3.add(x, -0.66, z);
	                    player.getWorld().playEffect(location3, Effect.HAPPY_VILLAGER, 100, 100);
	                    location3.subtract(x, -0.66, z);
	                }
				}
			}, 0, 15L));
		}
	}
	public static void LavaDrip(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location2 = player.getEyeLocation();
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location2.add(x, -0.66, z);
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location2, Effect.LAVADRIP, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.LAVADRIP, 100, 100);
	                    location2.subtract(x, -0.66, z);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 10L));
		}
	}
	public static void WaterDrip(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location2 = player.getEyeLocation();
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location2.add(x, -0.66, z);
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location2, Effect.WATERDRIP, 100, 100);
	                    player.getWorld().playEffect(location3, Effect.WATERDRIP, 100, 100);
	                    location2.subtract(x, -0.66, z);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 10L));
		}
	}
	public static void Crit(Player p) {
		final Player player = (Player) p;
		if (ParticleUse.contains(player)) {
			player.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
			return;
		} else {
			final UUID uuid = player.getUniqueId();
			ParticleUse.add(player);
			BukkitScheduler scheduler3 = Bukkit.getServer().getScheduler();
			ParticleTask.put(uuid, scheduler3.runTaskTimer(plugin, new Runnable() {
				public void run() {
	                Location location2 = player.getEyeLocation();
	                Location location3 = player.getEyeLocation();
	                int particles = 50;
	                float radius = 0.7f;
	                for (int i = 0; i < particles; i++) {
	                    double angle, x, z;
	                    angle = 2 * Math.PI * i / particles;
	                    x = Math.cos(angle) * radius;
	                    z = Math.sin(angle) * radius;
	                    location2.add(x, -0.66, z);
	                    location3.add(x, -1.33, z);
	                    player.getWorld().playEffect(location2, Effect.CRIT, Integer.MAX_VALUE, Integer.MAX_VALUE);
	                    location2.subtract(x, -0.66, z);
	                    location3.subtract(x, -1.33, z);
	                }
				}
			}, 0, 10L));
		}
	}
	public static void removeParticles(Player p) {
		if (!(ParticleUse.contains(p))) {
			return;
		} else {
			ParticleUse.remove(p);
			ParticleTask.get(p.getUniqueId()).cancel();
		}
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player player = e.getPlayer();
		removeParticles(player);
	}

}
