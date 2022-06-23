package middlesand.rewardcrates.holograms;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import middlesand.rewardcrates.RewardCrates;
import org.bukkit.Location;

import java.util.logging.Level;

public class HologramManager {

    RewardCrates rC;
    private ESupportedHolograms supportedHolograms; // Which api can we use?
    private String nameOfAPI; // Name of the API that is enabled - Used for logging purposes
    private HologramsAPI holographicDisplaysAPI; // What the heck is this thing??!?!!
    public ESupportedHolograms getSupportedHolograms() {
        return supportedHolograms;
    }

    /**
     * Scans for any of the supported hologram plugins
     * */
    public void scanForHologramSupport(RewardCrates rewardCrates) {
        rC = rewardCrates;
        rC.getLogger().log(Level.INFO, "Scanning for hologram plugins to hook into...");
        if(rC.getServer().getPluginManager().getPlugin("HolographicDisplays")!= null) {
            rC.getLogger().log(Level.INFO, "Found HolographicDisplays");
            supportedHolograms = ESupportedHolograms.HOLOGRAPHICDISPLAYS;
            nameOfAPI = "HolographicDisplays";
        }
        if(rC.getServer().getPluginManager().getPlugin("DecentHolograms")!= null) {
            rC.getLogger().log(Level.INFO, "Found DecentHolograms");
            if(supportedHolograms != null) {
                rC.getLogger().log(Level.WARNING, "Overriding " + nameOfAPI + " hook with DecentHolograms! (If you wish to use " + nameOfAPI +" you can configure the ignore-apis section of the config)");
            }
            supportedHolograms = ESupportedHolograms.DECENTHOLOGRAMS;
            nameOfAPI = "DecentHolograms";
        }
    }
    public HologramAPIHookedHologram createTextHologram(String lines[], Location location) {
        switch(supportedHolograms) {
            case HOLOGRAPHICDISPLAYS: {
                Hologram holo = HologramsAPI.createHologram(rC, location);
                HologramAPIHookedHologram holoHooked = new HologramAPIHookedHologram(holo);
                return holoHooked;
            }
            case DECENTHOLOGRAMS: {
                return null; // TODO: DA EPIC FIXXYFIXXYIMPLEMENTYIMPLEMENTY
            }
            default: return null;
        }
    }
}
