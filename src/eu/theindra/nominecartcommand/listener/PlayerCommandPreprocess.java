package eu.theindra.nominecartcommand.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Minecart;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import eu.theindra.nominecartcommand.Main;

public class PlayerCommandPreprocess implements Listener{
	
	/**
	 * Created by Indra on 07-04-2017
	 * Project: NoMinecartCommand
	 */
	
	@EventHandler
	public void PlayerCommandPreProcessEvent(PlayerCommandPreprocessEvent e){
		if(e.getPlayer().isInsideVehicle() && e.getPlayer().getVehicle() instanceof Minecart){
			if(!Main.instance.getConfig().getList("commands").contains(e.getMessage().replace("/", "").toLowerCase().split(" ")[0])){
	    		e.setCancelled(true);
	    		e.getPlayer().sendMessage(
	    				ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("bericht")));
	    	}
	    }
	}
	
}
