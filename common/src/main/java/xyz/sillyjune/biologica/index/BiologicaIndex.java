package xyz.sillyjune.biologica.index;

import xyz.sillyjune.biologica.world.features.BiologicaFeatures;

public class BiologicaIndex {
    public static void register() {
        BiologicaBlocks.register();
        BiologicaItems.register();
        BiologicaCreativeModeTabs.register();
        BiologicaFeatures.register();
    }
}
