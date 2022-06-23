package middlesand.rewardcrates;

import middlesand.rewardcrates.crates.Crate;
import middlesand.rewardcrates.holograms.HologramManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Hashtable;
import java.util.logging.Level;

public final class RewardCrates extends JavaPlugin {

    // API managers
    HologramManager holoM;

    // Data handling
    Hashtable<String, Crate> crates;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "RewardCrates enabling");
        holoM = new HologramManager();
        holoM.scanForHologramSupport(this);
    }

    /**
     * Refresh configuration for this plugin
     * Used by the built-in reload command
     */
    public void refreshConfiguration() {

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
