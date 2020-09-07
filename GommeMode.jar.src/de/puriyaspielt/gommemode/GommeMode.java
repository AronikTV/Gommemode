/*    */ package de.puriyaspielt.gommemode;
/*    */ 
/*    */ import de.puriyaspielt.gommemode.command.GommeModeCommand;
/*    */ import java.util.ArrayList;
/*    */ import java.util.UUID;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class GommeMode
/*    */   extends JavaPlugin
/*    */ {
/* 12 */   private static GommeMode p = null;
/* 13 */   public String prefix = "§7[§bPixelMode§7] ";
/*    */   
/*    */   public static GommeMode getInstance() {
/* 16 */     return p;
/*    */   }
/*    */   
/* 19 */   public ArrayList<UUID> gommemode = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 23 */     p = this;
/* 24 */     getCommand("pixelmode").setExecutor((CommandExecutor)new GommeModeCommand());
/* 25 */     System.out.println("[PixelMode] wurde erfolgreich aktiviert!");
/*    */   }
/*    */   
/*    */   public void onDisable() {}
/*    */ }


/* Location:              /Users/lennox/Downloads/GommeMode.jar!/de/puriyaspielt/gommemode/GommeMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */