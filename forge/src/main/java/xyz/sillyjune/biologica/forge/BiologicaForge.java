package xyz.sillyjune.biologica.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.client.BiologicaClient;

@Mod(Biologica.MOD_ID)
public final class BiologicaForge {
    public BiologicaForge(FMLJavaModLoadingContext context) {
        IEventBus bus = context.getModEventBus();
        EventBuses.registerModEventBus(Biologica.MOD_ID, bus);
        bus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        Biologica.init();
    }

    @Mod.EventBusSubscriber(modid = Biologica.MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BiologicaClient.init();
        }
    }
}
