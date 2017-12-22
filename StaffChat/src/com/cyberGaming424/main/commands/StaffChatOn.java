package com.cyberGaming424.main.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.cyberGaming424.main.StaffChat;

public class StaffChatOn implements CommandExecutor, Listener {
	private StaffChat plugin;

	public StaffChatOn(StaffChat p1) {
		plugin = p1;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		List<String> serverAdmins = plugin.getConfig().getStringList("Server Admins");
		String playerName = sender.getName();
		
		if (!(sender instanceof Player)) {

			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		if (!(serverAdmins.contains(playerName))) {

			sender.sendMessage("You must be a staff member to use this command!");
			return false;
		}
		
		return true;
	}


}
