package middlesand.sanecrates;

import middlesand.sanecrates.holograms.HologramManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class SaneCrates extends JavaPlugin {
    HologramManager holoM;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "SaneCrates enabling");
        holoM = new HologramManager();
        holoM.scanForHologramSupport(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
