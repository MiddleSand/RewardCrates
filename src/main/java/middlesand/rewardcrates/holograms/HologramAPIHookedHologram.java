package middlesand.rewardcrates.holograms;

import org.bukkit.Location;

public class HologramAPIHookedHologram {
    String lines[]; // Lines for the hologram
    Location currentLocation; // Location this hologram is in
    ESupportedHolograms api; // Which API does this hologram connect to? Should always be the only one hooked...
    Class apiHologramObject; // API backed object containing this hologram's data in the context of its API
}
