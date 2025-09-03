package xyz.sillyjune.biologica;

import xyz.sillyjune.biologica.Util.Tabs;
import xyz.sillyjune.biologica.world.features.Features;

public final class Biologica {
    public static final String MOD_ID = "biologica";

    public static void init() {
        // Write common init code here.
        Blocks.register();
        Items.register();
        Tabs.register();
        Features.register();
    }
}
