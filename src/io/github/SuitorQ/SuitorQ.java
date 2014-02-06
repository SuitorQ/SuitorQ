//testing
package io.github.SuitorQ;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SuitorQ extends JavaPlugin{
    
    public final Logger logger = Logger.getLogger("Minecraft");
    public static SuitorQ plugin;
    
    @Override
    public void onDisable(){
       PluginDescriptionFile pdfFile = this.getDescription();
       this.logger.info(pdfFile.getName() + " Has Been Disabled");
    }
    @Override
    public void onEnable(){
       PluginDescriptionFile pdfFile = this.getDescription();
       this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been ENABLED");
        
    } 
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(sender instanceof Player){
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("quin")){
                player.sendMessage(ChatColor.RED + ">> " + ChatColor.ITALIC + "17 centimeters");
                
            }
    	}
        return false;
    }
}