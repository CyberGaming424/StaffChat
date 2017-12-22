package com.cyberGaming424.main;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.cyberGaming424.main.commands.StaffChatOn;

public class StaffChat extends JavaPlugin {
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		registerCommands();

		logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
	}

	public void onDisabled() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + " has been disabled (V." + pdfFile.getVersion() + ")");
	}

	public void registerCommands() {
		getCommand("StaffChatOn").setExecutor(new StaffChatOn(this));
		// getCommand("menu").setExecutor(new Equip());

	}
	/*
	 * public void registerEvents() { PluginManager pm =
	 * getServer().getPluginManager();
	 * 
	 * // pm.registerEvents(new BlockBreak(), this); }
	 * 
	 * private void registerCongig() { getConfig().options().copyDefaults(true);
	 * saveConfig(); }
	 */
}
