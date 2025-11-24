package xyz.sillyjune.biologica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.sillyjune.biologica.index.BiologicaIndex;

public final class Biologica {
    public static final String MOD_ID = "biologica";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Initializing " + MOD_ID);
        BiologicaIndex.register();
    }
}
