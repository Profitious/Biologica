package xyz.sillyjune.biologica.forge;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import dev.architectury.registry.level.biome.forge.BiomeModificationsImpl;
import xyz.sillyjune.biologica.Biologica;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;

@Mod(MOD_ID)
public final class BiologicaForge {
    public BiologicaForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Biologica.init();
    }
}
