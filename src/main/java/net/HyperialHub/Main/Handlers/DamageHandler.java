package net.HyperialHub.Main.Handlers;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.PlayerJoin;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class DamageHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public DamageHandler(Main hub) {
		this.plugin = hub;
	}

	@EventHandler
	public void onVoidDamage(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if (p.getLocation().getY() <= 0.0D) {
			Location loc = new Location(Bukkit.getWorld("world"), -196.5, 8, 960.5, -90, 0);
			e.getPlayer().teleport(loc);
		}
	}
	
	@EventHandler
	  public void onEntityDamage(EntityDamageEvent e)
	  {
	    if ((e.getEntity() instanceof Player))
	    {
	      if ((e.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
	    	  e.setCancelled(true);
	      }
	    }
	  }
	
	@EventHandler
	public void respawnEvent(PlayerRespawnEvent e){
		Location loc = new Location(Bukkit.getWorld("world"), -196.5, 8, 960.5, -90, 0);
		e.getPlayer().teleport(loc);
		e.getPlayer().getInventory().clear();
		PlayerJoin.giveItems(e.getPlayer());
		HashMapStorage.PvP.remove(e.getPlayer().getUniqueId());
		e.getPlayer().getInventory().setArmorContents(null);
		Util.updateinventory(e.getPlayer());
	}
	
	@EventHandler
	public void deathEvent(PlayerDeathEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getEntity().getKiller() instanceof Player){
				Player killer = e.getEntity().getKiller();
				Player player = e.getEntity();
				Shards.giveShard(killer, Util.randomNum(50, 100));
				e.setDeathMessage(Util.color("&b&lDEATH&8&l» &e" + player.getName() + " &5was murdered by &b" + killer.getName()));
				HashMapStorage.PvP.remove(player.getUniqueId());
				player.getWorld().strikeLightningEffect(player.getLocation());FireworkEffect yellowEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.YELLOW,Color.AQUA,Color.PURPLE }).with(FireworkEffect.Type.BURST).build();
				Packets.playFirework(killer.getLocation(),
						yellowEffect);
			}
		}
	}

	@EventHandler
	public void noPlayerDamage(EntityDamageByEntityEvent e) {
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Player player = (Player)e.getEntity();
				Player damager = (Player)e.getDamager();
				Integer damage = (int) player.getLastDamage();
				if(HashMapStorage.PvP.containsKey(player.getUniqueId()) && HashMapStorage.PvP.containsKey(damager.getUniqueId())){
					if(HashMapStorage.PvP.get(player.getUniqueId()) != HashMapStorage.PvP.get(damager.getUniqueId())){
					e.setCancelled(false);
					player.setVelocity(damager.getLocation().getDirection().multiply(1.4));
					damager.sendMessage(Util.color("&b&lPVP&8&l» &5You hit &e" + player.getName() + " &5for &b" + damage + " &5damage!"));
					player.sendMessage(Util.color("&b&lPVP&8&l» &5You were hit by &e" + damager.getName() + " &5for &b" + damage + " &5damage!"));
					e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 152);
				}else{
					if(HashMapStorage.PvP.containsKey(player.getUniqueId()) && HashMapStorage.PvP.containsKey(damager.getUniqueId())){
					damager.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "    &eYou cant harm players on the same team!" + "\n" + "       &eChange teams to harm others with &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
					damager.playSound(damager.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
					e.setCancelled(true);
					}
				}
				}else{
					e.setCancelled(true);
					damager.playSound(damager.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
				}
				if(!(HashMapStorage.PvP.containsKey(player.getUniqueId())) && HashMapStorage.PvP.containsKey(damager.getUniqueId())){
					e.setCancelled(true);
					damager.playSound(damager.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
					damager.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "    &eThis person has pvp &cdisabled&e!" + "\n" + "       &eThis means you cant harm them!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}
				if(HashMapStorage.PvP.containsKey(player.getUniqueId()) && !(HashMapStorage.PvP.containsKey(damager.getUniqueId()))){
					e.setCancelled(true);
					damager.playSound(damager.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
					damager.sendMessage(Util.color("&8&l»&5&l&m-----------------------------------&r&8&l«" + "\n" + " " + "\n" + "    &eYou currently have pvp &cdisabled&e!" + "\n" + "       &eTurn pvp on to harm others with &b/pvp!" + "\n" + " " + "\n" + "&8&l»&5&l&m-----------------------------------&r&8&l«"));
				}
			}else{
				e.setCancelled(true);
			}
		}else{
			e.setCancelled(true);
		}
	}

}
