package eu.theindra.nominecartcommand;

import org.bukkit.plugin.java.JavaPlugin;

import eu.theindra.nominecartcommand.listener.PlayerCommandPreprocess;

public class Main extends JavaPlugin{
	
	/**
	 * Created by Indra on 07-04-2017
	 * Project: NoMinecartCommand
	 */
	
	public String[] author = { "TheIndra" };
	public static Main instance;

	public void onEnable(){
		instance = this;
		
		getConfig().options().copyDefaults(true); 
		saveConfig();
		
		getServer().getPluginManager().registerEvents(new PlayerCommandPreprocess(), this);
	}
}
