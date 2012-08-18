package com.github.lorddev.commandchanger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandChanger extends JavaPlugin {
	public void onEnable(){ 
		getLogger().info("Your plugin has been enabled.");
	}
	 
	public void onDisable(){ 
		getLogger().info("Your plugin has been disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}
		
		if(cmd.getName().equalsIgnoreCase("zasady")) {
			player.chat("/rules");
			return true;
		} 
		return false; 
	}
}
