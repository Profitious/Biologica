package xyz.sillyjune.biologica;

import xyz.sillyjune.biologica.index.BiologicaIndex;

public final class Biologica {
    public static final String MOD_ID = "biologica";

    public static void init() {
        BiologicaIndex.register();
    }
}
