package net.HyperialHub.Main.Handlers;

import java.util.Map.Entry;
import java.util.UUID;

import net.HyperialHub.Main.Main;
import net.HyperialHub.Main.Bungee.BUtil;
import net.HyperialHub.Main.Utils.HashMapStorage;
import net.HyperialHub.Main.Utils.Packets;
import net.HyperialHub.Main.Utils.Util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class ScoreBoardHandler implements Listener{
	
	private static Main plugin;
	public ScoreBoardHandler(Main listener) {
		ScoreBoardHandler.plugin = listener;
		boardUpdater();
	}
	
public static Scoreboard board;
public static Objective objective;
	
    public static void makeScoreBoard(final Player p){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        board = scoreboardManager.getNewScoreboard();
        objective = board.registerNewObjective("lobby","dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(Util.color("&5&lHyperial&b&lMC"));
        Score score1 = objective.getScore(Util.color("&8&l»&5&l&m----&b&l&m---&5&l&m----&8&l«"));
        score1.setScore(15);
        Score score = objective.getScore(Util.color("&e&l» &5&lUSERNAME"));
        score.setScore(14);
        Score score2 = objective.getScore(Util.color("&b"));
        score2.setScore(13);
        Score score3 = objective.getScore(Util.color(" "));
        score3.setScore(12);
        Score score4 = objective.getScore(Util.color("&e&l» &5&lSHARDS"));
        score4.setScore(11);
        Score score5 = objective.getScore(Util.color(ChatColor.YELLOW + "" + ChatColor.BOLD));
        score5.setScore(10);
        Score score6 = objective.getScore(Util.color("  "));
        score6.setScore(9);
        Score score7 = objective.getScore(Util.color("&e&l» &5&lONLINE"));
        score7.setScore(8);
        Score score8 = objective.getScore(Util.color(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD));
        score8.setScore(7);
        Score score9 = objective.getScore(Util.color("   "));
        score9.setScore(6);
        Score score10 = objective.getScore(Util.color("&e&l» &5&lSERVER"));
        score10.setScore(5);
        Score score11 = objective.getScore(Util.color(ChatColor.AQUA + "" + ChatColor.BOLD));
        score11.setScore(4);
        Score score12 = objective.getScore(Util.color("    "));
        score12.setScore(3);
        Score score13 = objective.getScore(Util.color("&e&l» &5&lWEBSITE"));
        score13.setScore(2);
        Score score14 = objective.getScore(Util.color(ChatColor.RED + "" + ChatColor.BOLD));
        score14.setScore(1);
        
        Team team1 = board.registerNewTeam("team1");
        team1.addEntry(Util.color("&b"));
        
        Team team2 = board.registerNewTeam("team2");
        team2.addEntry(ChatColor.YELLOW + "" + ChatColor.BOLD);

        Team team3 = board.registerNewTeam("team3");
        team3.addEntry(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD);
        
        Team team4 = board.registerNewTeam("team4");
        team4.addEntry(ChatColor.AQUA + "" + ChatColor.BOLD);
        
        Team team5 = board.registerNewTeam("team5");
        team5.addEntry(ChatColor.RED + "" + ChatColor.BOLD);
		p.setScoreboard(board);
    }
    
    
    public static void boardUpdater(){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
        		public void run() {
        			
        			for (Entry<UUID, Integer> entry : HashMapStorage.Shards.entrySet()) {
    					plugin.getConfig().set(entry.getKey() + ".Shards", entry.getValue());
    				}
        			
        			for(final Player p : Bukkit.getOnlinePlayers()){
        				if(!(p.equals(null))){
        					p.setPlayerListName(Util.color("&8&l«&b&l" + HashMapStorage.Shards.get(p.getUniqueId()).toString() + "&8&l»&a " + p.getName()));
        					Packets.sendTabTitle(p, Util.color("&8&l» &e&l- &5&lHyperial&b&lMC &e&l- &8&l«"), Util.color("&8&l» &e&l- &b&l&oPLAY.HYPERIALMC.NET &e&l- &8&l«"), Util.color("&8&l» &e&l- &b&l&oHYPERIALMC.NET &e&l- &8&l«"), Util.color("&e&l» &5GameMode: &b" + p.getGameMode()), Util.color("&e&l» &5Your Ping Is: &b" + ((CraftPlayer) p).getHandle().ping), Util.color("&e&l» &5Online Players: &b" + BUtil.playerCountOfServer(p, "ALL")));
        				
        			Team team1 = p.getScoreboard().getTeam("team1");
    				team1.setPrefix(Util.color("&8&l" + "▶ "));
    				team1.setSuffix(Util.color(p.getName()));
        			
    				Team team2 = p.getScoreboard().getTeam("team2"); 
    				team2.setPrefix(Util.color("&8&l" + "▶ "));
    				team2.setSuffix(Util.color("&b" + HashMapStorage.Shards.get(p.getUniqueId()).toString()));
    				
    				Team team3 = p.getScoreboard().getTeam("team3");
    				team3.setPrefix(Util.color("&8&l" + "▶ "));
    				team3.setSuffix(Util.color("&b" + BUtil.playerCountOfServer(p, "ALL")));
    				
    				Team team4 = p.getScoreboard().getTeam("team4");
    				team4.setPrefix(Util.color("&8&l" + "▶ "));
    				team4.setSuffix(Util.color("&b" + BUtil.getServer(p)));
    				
    				Team team5 = p.getScoreboard().getTeam("team5");
    				team5.setPrefix(Util.color("&8&l" + "▶ "));
    				team5.setSuffix(Util.color("&bHyperialMC.net"));
        			}
        			}
        			}
            	}, 0, 5);
					//END OF SCOREBOARD DISPLAYNAME
    }
}
