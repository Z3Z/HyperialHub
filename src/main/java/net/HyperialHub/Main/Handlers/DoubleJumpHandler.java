package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJumpHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public DoubleJumpHandler(Main hub) {
		this.plugin = hub;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.setAllowFlight(true);
		p.setFlying(false);
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerFly(PlayerToggleFlightEvent e) {
		final Player p = e.getPlayer();
		if (p.getGameMode() != GameMode.CREATIVE) {
			e.setCancelled(true);
			if(!(HashMapStorage.Parkour.containsKey(p.getUniqueId()))){
			p.setAllowFlight(false);
			p.setFlying(false);
			p.setVelocity(p.getLocation().getDirection().multiply(2.0D)
					.setY(1D));
			p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 15);
			p.playEffect(p.getLocation(), Effect.COLOURED_DUST, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 15);
			p.playEffect(p.getLocation(), Effect.COLOURED_DUST, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 15);
			p.playEffect(p.getLocation(), Effect.COLOURED_DUST, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playEffect(p.getLocation(), Effect.LAVA_POP, 15);
			p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_BLAST, 10.0F, 10.0F);
			p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LAUNCH, 10.0F, 10.0F);
			p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 10.0F, 10.0F);
			p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LARGE_BLAST, 10.0F,
					10.0F);
		}else{
			e.setCancelled(true);
			p.setAllowFlight(false);
			p.setFlying(false);
			p.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "      &eYou cannot double jump while" + "\n" + "       &ein parkour mode to leave type &b/parkour leave!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
		}
		}
	}

	@EventHandler
	public void move(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if ((e.getPlayer().getGameMode() != GameMode.CREATIVE)
				&& (p.getLocation().getBlock().getRelative(BlockFace.DOWN)
						.getType() != Material.AIR)) {
			p.setAllowFlight(true);
		}
	}
}
