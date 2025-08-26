package xyz.sillyjune.biologica.forge;

import xyz.sillyjune.biologica.Biologica;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Biologica.MOD_ID)
public final class BiologicaForge {
    public BiologicaForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Biologica.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Biologica.init();
    }
}
