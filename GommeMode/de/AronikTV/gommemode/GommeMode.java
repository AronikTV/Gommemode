	package de.AronikTV.gommemode;
 
	import de.AronikTV.gommemode.command.GommeModeCommand;
	import java.util.ArrayList;
	import java.util.UUID;
	import org.bukkit.command.CommandExecutor;
	import org.bukkit.plugin.java.JavaPlugin;
 
	public class GommeMode
	extends JavaPlugin
 {
	private static GommeMode p = null;
	public String prefix = "§7[§bGommeMode§7] ";
   
	public static GommeMode getInstance() {
    return p;
   }
   
	public ArrayList<UUID> gommemode = new ArrayList<>();
 
  
	public void onEnable() {
     p = this;
    getCommand("Gommemode").setExecutor((CommandExecutor)new GommeModeCommand());
    System.out.println("[Gommemode] wurde erfolgreich aktiviert!");
  }
  
	public void onDisable() {}
}