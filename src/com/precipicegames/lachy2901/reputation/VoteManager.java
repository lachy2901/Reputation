package com.precipicegames.lachy2901.reputation;

import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class VoteManager {

	String owner;
	Rank rank;
	HashMap<Rank, Integer> score = new HashMap<Rank, Integer>();
	ArrayList<String> voters = new ArrayList<String>();
	
	public VoteManager(Player p) {
		owner = p.getName();
		rank = Utils.getRank(p);
		
	}
	
	public void vote(boolean up, Player who) {
		checkRank();
		if (!voters.contains(who.getName())) {
			if (up) {
				score.put(Utils.getRank(who), score.get(Utils.getRank(who)) + 1);
			} else {
				score.put(Utils.getRank(who), score.get(Utils.getRank(who)) - 1);
			}
			voters.add(who.getName());
		}
	}
	
	public void checkRank() {
		if (Utils.getRank(Bukkit.getPlayerExact(owner)) != rank) {
			score.clear();
			voters.clear();
			rank = Utils.getRank(Bukkit.getPlayerExact(owner));
		}
	}
	
}
