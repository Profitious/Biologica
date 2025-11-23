package xyz.sillyjune.biologica.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.client.BiologicaClient;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;

@Mod(MOD_ID)
public final class BiologicaForge {
    public BiologicaForge(FMLJavaModLoadingContext context) {
        Biologica.init();
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BiologicaClient.init();
        }
    }
}
