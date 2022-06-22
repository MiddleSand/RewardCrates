package middlesand.sanecrates.holograms;

import com.gmail.filoghost.holographicdisplays.*;

import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import middlesand.sanecrates.SaneCrates;

import java.util.logging.Level;

public class HologramManager {

    private ESupportedHolograms supportedHolograms; // Which api can we use?
    private String nameOfAPI;
    private HologramsAPI holographicDisplaysAPI;

    public ESupportedHolograms getSupportedHolograms() {
        return supportedHolograms;
    }

    /**
     * Scans for any of the supported hologram plugins
     * */
    public void scanForHologramSupport(SaneCrates sC) {
        sC.getLogger().log(Level.INFO, "Scanning for hologram plugins to hook into...");
        if(sC.getServer().getPluginManager().getPlugin("HolographicDisplays")!= null) {
            sC.getLogger().log(Level.INFO, "Found HolographicDisplays");
            supportedHolograms = ESupportedHolograms.HOLOGRAPHICDISPLAYS;
            nameOfAPI = "HolographicDisplays";
        }
        if(sC.getServer().getPluginManager().getPlugin("DecentHolograms")!= null) {
            sC.getLogger().log(Level.INFO, "Found DecentHolograms");
            if(supportedHolograms != null) {
                sC.getLogger().log(Level.INFO, "Overriding " + nameOfAPI + " (If you wish to use " + nameOfAPI +" you can configure the ignore-apis section of the config)");
            }
            supportedHolograms = ESupportedHolograms.DECENTHOLOGRAMS;
            nameOfAPI = "DecentHolograms";
        }
    }

}
