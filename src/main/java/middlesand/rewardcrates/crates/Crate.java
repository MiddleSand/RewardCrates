package middlesand.rewardcrates.crates;

import middlesand.rewardcrates.configuration.CrateConfiguration;
import middlesand.rewardcrates.holograms.HologramAPIHookedHologram;
import org.bukkit.Location;

public class Crate {
    private Location cratelocation; // The location this crate is in
    private HologramAPIHookedHologram[] holos; // Holograms associated with this plugin - Only one on most crates
    private CrateConfiguration crateConfig; // CrateConfiguration for this Crate
    /**
     * Sets up this Crate to exist
     * */
    public Crate(CrateConfiguration cConfig, Location location, String[] holograms) {
        crateConfig = cConfig;
        cratelocation = location;
    }
}
