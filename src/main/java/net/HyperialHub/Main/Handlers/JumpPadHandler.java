package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class JumpPadHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public JumpPadHandler(Main hub) {
		this.plugin = hub;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLaunch(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(p.getLocation().getWorld().getBlockAt(p.getLocation()).getType() == Material.STONE_PLATE){
			p.setVelocity(p.getLocation().getDirection().setZ(3.5).setX(0).setY(2.5));
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
	}
	
	

}
