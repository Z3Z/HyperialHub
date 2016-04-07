package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PickupHandler implements Listener {
	@SuppressWarnings("unused")
	private static Main plugin;

	public PickupHandler(Main hub) {
		PickupHandler.plugin = hub;
	}

	@EventHandler
	public void onPlayerPickupItem(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if (e.getItem().getItemStack().getType() == Material.PRISMARINE_SHARD) {
			if(p.getGameMode() == GameMode.SURVIVAL || p.getGameMode() == GameMode.ADVENTURE){
			Shards.giveShard(p, Util.randomNum(1, 20));
			e.getItem().remove();
			p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP,
					Integer.MAX_VALUE, Integer.MAX_VALUE);
			e.setCancelled(true);
			}else{
				e.setCancelled(false);
			}
		} else {
			if(p.getGameMode() == GameMode.SURVIVAL || p.getGameMode() == GameMode.ADVENTURE){
				e.setCancelled(true);
				}else{
					e.setCancelled(false);
				}
		}
	}

}
