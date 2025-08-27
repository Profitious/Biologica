package xyz.sillyjune.biologica;

import xyz.sillyjune.biologica.Util.Tabs;

public final class Biologica {
    public static final String MOD_ID = "biologica";

    public static void init() {
        // Write common init code here.
        Blocks.register();
        Items.register();
        Tabs.register();
    }
}
