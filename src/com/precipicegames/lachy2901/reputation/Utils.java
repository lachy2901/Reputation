package com.precipicegames.lachy2901.reputation;

import org.bukkit.entity.Player;

public class Utils {

	public static Rank getRank(Player p) {
		if (p.hasPermission("rep.rank.apprentice")) {
			return Rank.APPRENTICE;
		} else if (p.hasPermission("rep.rank.journeyman")) {
			return Rank.JOURNEYMAN;
		} else if (p.hasPermission("rep.rank.mastercrafstman")) {
			return Rank.MASTERCRAFTSMAN;
		} else if (p.hasPermission("rep.rank.vip")) {
			return Rank.VIP;
		} else if (p.hasPermission("rep.rank.mod")) {
			return Rank.MOD;
		} else if (p.hasPermission("rep.rank.smod")) {
			return Rank.SENIOR_MOD;
		} else if (p.hasPermission("rep.rank.developer")) {
			return Rank.DEVELOPER;
		} else if (p.hasPermission("rep.rank.admin")) {
			return Rank.ADMIN;
		} else if (p.hasPermission("rep.rank.guest")) {
			return Rank.GUEST;
		} else {
			return null;
		}
	}
	
}
