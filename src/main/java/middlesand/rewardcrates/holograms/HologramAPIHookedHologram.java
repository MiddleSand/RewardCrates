package middlesand.rewardcrates.holograms;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import org.bukkit.Location;
import org.bukkit.util.Vector;


public class HologramAPIHookedHologram {
    private String lines[]; // Lines for the hologram
    private Location currentLocation; // Location this hologram is in
    private ESupportedHolograms api; // Which API does this hologram connect to? Should always be the only one hooked...
    Object apiHologramObject; // API backed object containing this hologram's data in the context of its API

    public HologramAPIHookedHologram(Object theHologram) {
        apiHologramObject = theHologram;
    }

    public void setHologramPosition(Location to) {
        switch (api) {
            case HOLOGRAPHICDISPLAYS: {
                Hologram holo = (Hologram) apiHologramObject;
                holo.teleport(to);
                return;}
            case DECENTHOLOGRAMS: {
                eu.decentsoftware.holograms.api.holograms.Hologram holo =
                        (eu.decentsoftware.holograms.api.holograms.Hologram) apiHologramObject;
                holo.setLocation(to);
                return;}
        }
    }

    public void slideToPosition(Location to) {
        // TODO: Do **superfun maths (tm)** to make this
    }
}
