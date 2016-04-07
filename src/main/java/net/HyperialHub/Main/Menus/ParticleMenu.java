package net.HyperialHub.Main.Menus;

import java.util.Arrays;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Currency.Shards;
import net.HyperialHub.Main.CustomAPI.Particles;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ParticleMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private Main plugin;
	public ParticleMenu(Main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, Util.color("&5&lParticle Menu"));
		Border();
		mobSpawner();
		lavaPop();
		bedrock();
		villager();
		witchMagic();
		RemoveParticles();
		fireWorkSpark();
		enchanting();
		rainbow();
		portal();
		end();
		heart();
		lavadrip();
		waterdrip();
		crit();
		p.openInventory(inv);
	}
	
	public static void Border(){
		ItemStack border = Util.createItem(Material.STAINED_GLASS_PANE, 1, 15, Util.color(" "), null);
		inv.setItem(0, border);
		inv.setItem(1, border);
		inv.setItem(2, border);
		inv.setItem(3, border);
		inv.setItem(4, border);
		inv.setItem(5, border);
		inv.setItem(6, border);
		inv.setItem(7, border);
		inv.setItem(8, border);
		inv.setItem(9, border);
		inv.setItem(17, border);
		inv.setItem(18, border);
		inv.setItem(26, border);
		inv.setItem(27, border);
		inv.setItem(35, border);
		inv.setItem(36, border);
		inv.setItem(37, border);
		inv.setItem(38, border);
		inv.setItem(39, border);
		inv.setItem(40, border);
		inv.setItem(41, border);
		inv.setItem(42, border);
		inv.setItem(43, border);
		inv.setItem(44, border);
	}
	
	public static void mobSpawner(){
		ItemStack particle = Util.createItem(Material.MOB_SPAWNER, 1, 0, Util.color("&5&lMobSpawner"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(10, particle);
	}
	
	public static void lavaPop(){
		ItemStack particle = Util.createItem(Material.LAVA_BUCKET, 1, 0, Util.color("&5&lLavaPop"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(11, particle);
	}
	
	public static void witchMagic(){
		ItemStack particle = Util.createItem(Material.SPIDER_EYE, 1, 0, Util.color("&5&lWitchMagic"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(12, particle);
	}
	
	public static void fireWorkSpark(){
		ItemStack particle = Util.createItem(Material.FIREWORK_CHARGE, 1, 0, Util.color("&5&lFireWorkSpark"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(13, particle);
	}
	
	public static void enchanting(){
		ItemStack particle = Util.createItem(Material.ENCHANTMENT_TABLE, 1, 0, Util.color("&5&lEnchanting"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(14, particle);
	}
	
	public static void rainbow(){
		ItemStack particle = Util.createItem(Material.BEACON, 1, 0, Util.color("&5&lRainbow"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(15, particle);
	}
	
	public static void portal(){
		ItemStack particle = Util.createItem(Material.ENDER_PEARL, 1, 0, Util.color("&5&lPortal"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(16, particle);
	}
	
	public static void end(){
		ItemStack particle = Util.createItem(Material.ENDER_PORTAL_FRAME, 1, 0, Util.color("&5&lEnd"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(19, particle);
	}
	
	public static void heart(){
		ItemStack particle = Util.createItem(Material.STAINED_GLASS, 1, 14, Util.color("&5&lHeart"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(20, particle);
	}
	
	public static void bedrock(){
		ItemStack particle = Util.createItem(Material.BEDROCK, 1, 0, Util.color("&5&lBedrock"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(21, particle);
	}
	
	public static void villager(){
		ItemStack particle = Util.createItem(Material.EMERALD, 1, 0, Util.color("&5&lVillager"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(22, particle);
	}
	
	public static void lavadrip(){
		ItemStack particle = Util.createItem(Material.LAVA_BUCKET, 1, 0, Util.color("&5&lLavaDrip"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(23, particle);
	}
	
	public static void waterdrip(){
		ItemStack particle = Util.createItem(Material.WATER_BUCKET, 1, 0, Util.color("&5&lWaterDrip"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(24, particle);
	}
	
	public static void crit(){
		ItemStack particle = Util.createItem(Material.ARROW, 1, 0, Util.color("&5&lCrit"), Arrays.asList(Util.color(" "), Util.color("&eCost: &b150 Shards"), Util.color("&eClick to activate the"), Util.color("&eselected particle for a fun"), Util.color("&eparticle party around you!"), Util.color(" "), Util.color("&8Click to activate")));inv.setItem(25, particle);
	}
	
	public static void RemoveParticles(){
		ItemStack item = Util.createItem(Material.BARRIER, 1, 0, Util.color("&c&lRemove Particles"), Arrays.asList(Util.color(" "), Util.color("&eCost: &bNo Cost"), Util.color("&eRemove any active particles from"), Util.color("&eyou and make it to where"), Util.color("&eyou dont have any effects!"), Util.color(" "), Util.color("&8Click to activate")));
		inv.setItem(34, item);
	}
	
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		final Player p = (Player) e.getWhoClicked();
		Integer cost = 150;
		Integer shards = HashMapStorage.Shards.get(p.getUniqueId()).intValue();
		if(e.getInventory().getName().equals(Util.color("&5&lParticle Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							if(e.getCurrentItem().getType().equals(Material.MOB_SPAWNER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lMobSpawner"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.MobSpawner(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LAVA_BUCKET)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lLavaPop"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.LavaPop(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.SPIDER_EYE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lWitchMagic"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.WitchMagic(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.FIREWORK_CHARGE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lFireWorkSpark"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.FireWorkSpark(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.ENCHANTMENT_TABLE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lEnchanting"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Enchanting(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BEACON)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lRainbow"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Rainbow(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.ENDER_PEARL)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lPortal"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Portal(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.ENDER_PORTAL_FRAME)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lEnd"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.End(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lHeart"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Heart(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.BEDROCK)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lBedrock"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Bedrock(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.EMERALD)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lVillager"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Villager(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.LAVA_BUCKET)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lLavaDrip"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.LavaDrip(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.WATER_BUCKET)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lWaterDrip"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.WaterDrip(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.ARROW)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&5&lCrit"))){
									if(!(Particles.ParticleUse.contains(p))){
									if(shards >= cost){
										e.setCancelled(true);
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										Particles.Crit(p);
										Shards.takeShard(p, cost);
										p.closeInventory();
									}else{
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You do not have enough shards to do this!"));
									}
									}else{
										p.sendMessage(Util.color("&b&lPARTICLES&8&l» &5You may only have one particle at a time!"));
										e.setCancelled(true);
										p.closeInventory();
										p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									}
								}
							}
							
							
							
							if(e.getCurrentItem().getType().equals(Material.BARRIER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color("&c&lRemove Particles"))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									Particles.removeParticles(p);
								}
							}
							
							
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Util.color(" "))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
						}else{
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
						}
					}else{
						e.setCancelled(true);
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
					}
				}else{
					e.setCancelled(true);
				}
			}else{
				e.setCancelled(true);
			}
		}
	}

}
