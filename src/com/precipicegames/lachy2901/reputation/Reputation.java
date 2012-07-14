package com.precipicegames.lachy2901.reputation;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Reputation extends JavaPlugin {

	HashMap<String, VoteManager> vm = new HashMap<String, VoteManager>();
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender cs, Command cmd, String cl, String[] a) {
		
		if (cl.equalsIgnoreCase("vote")) {
			if (!cs.hasPermission("rep.vote")) {
				cs.sendMessage(ChatColor.RED + "You don't have permission to vote.");
				return true;
			} else if (a[0] == null || a[1] == null) {
				cs.sendMessage(ChatColor.RED + "You need to specify a player to vote.");
				return true;
			}
			
			Vote v;
			
			if (a[1] == "up") {
				v = Vote.UP;
			} else {
				v = Vote.DOWN;
			}
			
			vm.get(Bukkit.getPlayer(a[0]).getName()).vote(v, ((Player) cs));
			
		}
		
		return true;
	}
	
}
