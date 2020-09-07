/*    */ package de.puriyaspielt.gommemode.command;
/*    */ 
/*    */ import de.puriyaspielt.gommemode.GommeMode;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GommeModeCommand
/*    */   implements CommandExecutor
/*    */ {
/* 16 */   private GommeMode p = GommeMode.getInstance();
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 21 */     if (!(sender instanceof Player)) {
/* 22 */       return true;
/*    */     }
/*    */     
/* 25 */     Player player = (Player)sender;
/*    */     
/* 27 */     if (args.length == 0) {
/* 28 */       if (!this.p.gommemode.contains(player.getUniqueId())) {
/* 29 */         player.setGameMode(GameMode.CREATIVE);
/* 30 */         player.sendMessage(String.valueOf(this.p.prefix) + "§aDu bist im GommeMode!");
/* 31 */         this.p.gommemode.add(player.getUniqueId());
/* 32 */       } else if (this.p.gommemode.contains(player.getUniqueId())) {
/* 33 */         player.setGameMode(GameMode.SURVIVAL);
/* 34 */         player.sendMessage(String.valueOf(this.p.prefix) + "§cDu bist nicht mehr im GommeMode!");
/* 35 */         this.p.gommemode.remove(player.getUniqueId());
/*    */       } 
/*    */     }
/* 38 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/lennox/Downloads/GommeMode.jar!/de/puriyaspielt/gommemode/command/GommeModeCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */