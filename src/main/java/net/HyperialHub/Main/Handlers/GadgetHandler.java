package net.HyperialHub.Main.Handlers;

import java.util.HashMap;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

public class GadgetHandler implements Listener{
	
	private Main plugin;
	public GadgetHandler(Main listener) {
		this.plugin = listener;	
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void Grenade(PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		Integer cost = 250;
		Integer shards = HashMapStorage.Shards.get(p.getUniqueId()).intValue();
		World world = p.getWorld();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.MAGMA_CREAM) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lGrenade &e- &b&lRight Click"))){
							if(shards >= cost){
								if(CooldownHandler.tryCooldown(p, "Grenade", 5000)){
									final Item grenade = world.dropItem(p.getEyeLocation()
											.subtract(0, 0.7, 0), new ItemStack(
											Material.MAGMA_CREAM));
									Shards.takeShard(p, cost);
									grenade.setVelocity(p.getLocation().getDirection());
									
									BukkitScheduler scheduler = Bukkit.getServer()
											.getScheduler();
									scheduler.scheduleSyncDelayedTask(plugin, new Runnable() {
										public void run() {
											p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You may now use your gadget again!"));
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.FLAME, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.CLOUD, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.CLOUD, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.CLOUD, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.CLOUD, Integer.MAX_VALUE);
											p.playEffect(grenade.getLocation(), Effect.CLOUD, Integer.MAX_VALUE);

											p.playSound(grenade.getLocation(),
													Sound.ENTITY_FIREWORK_LARGE_BLAST,
													Integer.MAX_VALUE, Integer.MAX_VALUE);
											p.playSound(grenade.getLocation(),
													Sound.ENTITY_FIREWORK_TWINKLE, Integer.MAX_VALUE,
													Integer.MAX_VALUE);
											p.playSound(grenade.getLocation(),
													Sound.ENTITY_FIREWORK_LAUNCH, Integer.MAX_VALUE,
													Integer.MAX_VALUE);
											p.playSound(grenade.getLocation(),
													Sound.ENTITY_GENERIC_EXPLODE, Integer.MAX_VALUE,
													Integer.MAX_VALUE);
											grenade.remove();
										}
									}, 100L);
								}else {
									p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You must wait &e" + (CooldownHandler.getCooldown(p, "Grenade") / 1000) + " &5more seconds!"));
								}
							}else{
								p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You do not have enough shards!"));
							}
						}
					}
				}
			}
		}
	}
	
	
	
	HashMap<Player, BukkitTask> ShardBomb = new HashMap<Player, BukkitTask>();
	@SuppressWarnings("deprecation")
	@EventHandler
	public void ShardBomb(PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		Integer cost = 500;
		Integer shards = HashMapStorage.Shards.get(p.getUniqueId()).intValue();
		World world = p.getWorld();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.PRISMARINE_SHARD) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Util.color("&5&lShardBomb &e- &b&lRight Click"))){
							if(shards >= cost){
								if(CooldownHandler.tryCooldown(p, "ShardBomb", 60000)){
									final Item shardbomb = world.dropItem(p.getEyeLocation()
											.subtract(0, 0.7, 0), new ItemStack(
											Material.OBSIDIAN));
									Shards.takeShard(p, cost);
									shardbomb.setVelocity(p.getLocation().getDirection());
									
									BukkitScheduler scheduler = Bukkit.getServer()
											.getScheduler();
									scheduler.scheduleSyncDelayedTask(plugin, new Runnable() {
										public void run() {
											p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You may now use your gadget again!"));
											ShardBomb.get(p).cancel();
											shardbomb.remove();
										}
									}, 20 * 30L);
									ShardBomb.put(p,
											scheduler.runTaskTimer(plugin, new Runnable() {
												public void run() {
													FireworkEffect yellowEffect = FireworkEffect
															.builder()
															.trail(true)
															.flicker(true)
															.withColor(
																	new Color[] { Color.YELLOW,
																			Color.AQUA,
																			Color.PURPLE })
															.with(FireworkEffect.Type.BURST)
															.build();
													Packets.playFirework(shardbomb.getLocation(),
															yellowEffect);
													Item shard = shardbomb
															.getLocation()
															.getWorld()
															.dropItem(
																	shardbomb.getLocation(),
																	new ItemStack(
																			Material.PRISMARINE_SHARD,
																			1));
													Vector direction = new Vector();
													direction.setX(0.0D + Math.random()
															- Math.random());
													direction.setY(0.2D + Math.random());
													direction.setZ(0.0D + Math.random()
															- Math.random());
													shard.setVelocity(direction);
												}
											}, 0, 10L));
								}else {
									p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You must wait &e" + (CooldownHandler.getCooldown(p, "ShardBomb") / 1000) + " &5more seconds!"));
								}
							}else{
								p.sendMessage(Util.color("&b&lGADGETS&8&l» &5You do not have enough shards!"));
							}
						}
					}
				}
			}
		}
	}
}
