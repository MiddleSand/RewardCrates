package middlesand.rewardcrates.animations;

import middlesand.rewardcrates.crates.Crate;
import middlesand.rewardcrates.holograms.HologramAPIHookedHologram;
import org.bukkit.entity.Player;

public class CrateAnimation {

    private Crate theCrate;

    private int executionTicks[]; // Timing of "segments" for this animation
    private boolean loop; // True if this animation is designed to loop
    private int loopTimes; // Times to repeat the initial animation
    private HologramAPIHookedHologram holo; // Typically null, may not be (duh ig.. XD)
    private Runnable[] endActions; // Actions to be ran at the end of this animation
    public Runnable[] getEndActions() {
        return endActions;
    }

    /**
     *  Constructor for crate animations - Used primarily to init the configured animations
     * */
    public CrateAnimation(Runnable[] endActionArray) {
        endActions = endActionArray;
    }

    public void executeAnimation(Player crateTarget) {

    }
}
