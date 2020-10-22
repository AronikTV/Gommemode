 package de.AronikTV.gommemode.command;
 
 import de.AronikTV.gommemode.GommeMode;
 import org.bukkit.GameMode;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;


 public class GommeModeCommand
   implements CommandExecutor
{
   private GommeMode p = GommeMode.getInstance();



   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
      return true;
     }
     
   Player player = (Player)sender;
   
     if (args.length == 0) {
       if (!this.p.gommemode.contains(player.getUniqueId())) {
       player.setGameMode(GameMode.CREATIVE);
     player.sendMessage(String.valueOf(this.p.prefix) + "§aDu bist im GommeMode!");
      this.p.gommemode.add(player.getUniqueId());
      } else if (this.p.gommemode.contains(player.getUniqueId())) {
        player.setGameMode(GameMode.SURVIVAL);
       player.sendMessage(String.valueOf(this.p.prefix) + "§cDu bist nicht mehr im GommeMode!");
        this.p.gommemode.remove(player.getUniqueId());
      } 
    }
     return true;
   }
 }
