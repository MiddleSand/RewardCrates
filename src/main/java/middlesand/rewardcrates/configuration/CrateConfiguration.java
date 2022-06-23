package middlesand.rewardcrates.configuration;

import middlesand.rewardcrates.animations.CrateAnimation;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CrateConfiguration {
    // Stores the identity of a crate - such as its name, styling, animation parameters, hologram logic, and more.

    // Basics
    private String crateName; // System name of this crate
    private ItemStack crateItem; // Item this crate will be represented by
    private Material crateBlock; // Block this crate will be "contained" by
    // TODO: Make HologramWrapper class to handle holos properly
    // TODO: Make CrateRewards class to handle crate rewards

    // Animation
    private CrateAnimation crateAnimation; // Animation data for this crate

    public CrateConfiguration(String name) {
        this.crateName = name;
    }
    /**
     * Crate for testing purposes! XD
     * */
    public CrateConfiguration createTestCrate() {
        this.crateItem = new ItemStack(Material.CHEST);
        this.crateItem.getItemMeta().setDisplayName("EGG");
        this.crateBlock = Material.CHEST;
        return this;
    }
    
    public void saveToConfigurationFile(String configFile) {
        //TODO: Save to configgggggggggg uwafiobwvaoibwnvainseve
    }



}
