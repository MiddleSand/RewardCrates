package middlesand.sanecrates.animations;

import middlesand.sanecrates.holograms.HologramAPIHookedHologram;

public class CrateAnimation {

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
}
