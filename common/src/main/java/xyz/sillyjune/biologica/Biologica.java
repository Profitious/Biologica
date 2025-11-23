package xyz.sillyjune.biologica;

import xyz.sillyjune.biologica.block.BiologicaBlocks;
import xyz.sillyjune.biologica.item.BiologicaItems;
import xyz.sillyjune.biologica.util.BiologicaCreativeModeTabs;
import xyz.sillyjune.biologica.world.features.BiologicaFeatures;

public final class Biologica {
    public static final String MOD_ID = "biologica";

    public static void init() {
        // Write common init code here.
        BiologicaBlocks.register();
        BiologicaItems.register();
        BiologicaCreativeModeTabs.register();
        BiologicaFeatures.register();
    }
}
