package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.CustomAPI.Pets;
import net.HyperialHub.Main.Utils.Util;
import net.minecraft.server.v1_9_R1.EntityInsentient;
import net.minecraft.server.v1_9_R1.PathEntity;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PetHandler implements Listener {
	private static Main plugin;

	public PetHandler(Main hub) {
		PetHandler.plugin = hub;
	}

	public static void petfollow(final Player player, final Entity pet, final Double petSpeed) {
		new BukkitRunnable() {
			@SuppressWarnings("deprecation")
			public void run() {

				if (!pet.isValid()) {
					this.cancel();
					return;
				}

				if (!player.isOnline()) {
					this.cancel();
					pet.remove();
					return;
				}

				EntityInsentient petObject = (EntityInsentient) ((CraftEntity) pet)
						.getHandle();

				Location loc = player.getLocation();

				PathEntity path;

				path = (petObject).getNavigation().a(loc.getX() + Util.randomNum(-2, 2),
						loc.getY(), loc.getZ() + Util.randomNum(-2, 2));

				if (path != null) {

					(petObject).getNavigation().a(path, petSpeed);
				}

				int distance = (int) loc.distance(pet.getLocation());

				if (distance > 10 && !pet.isDead() && player.isOnGround()) {
					pet.teleport(loc);
				}

			}
		}.runTaskTimer(plugin, 0L, 5L);
	}

	public static void removePets(Player p) {
		if (!(Pets.PetUse.containsKey(p.getUniqueId()))) {
			return;
		} else {
			Pets.PetUse.get(p.getUniqueId()).remove();
			Pets.PetUse.remove(p.getUniqueId());
			Pets.tasks2.get(p.getUniqueId()).cancel();
		}
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = (Player) e.getPlayer();
		if (!(Pets.PetUse.containsKey(p.getUniqueId()))) {
			return;
		} else {
			Pets.PetUse.get(p.getUniqueId()).remove();
			Pets.PetUse.remove(p.getUniqueId());
			Pets.tasks2.get(p.getUniqueId()).cancel();
		}
	}

}
