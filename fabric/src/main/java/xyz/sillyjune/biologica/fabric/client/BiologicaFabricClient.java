package xyz.sillyjune.biologica.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import static xyz.sillyjune.biologica.Blocks.*;

public final class BiologicaFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                BOSTON_FERN.get(),
                CRANBERRY_BUSH.get(),
                BLUE_BONNET.get(),
                HELICONIA.get(),
                PEACE_LILY.get(),
                FLAMINGO_FLOWER.get(),
                OCOTILLO.get(),
                LAVENDER.get(),
                HORSETAILS.get(),
                DRACAENA.get(),
                ALOE_VERA.get(),
                RUBBER_PLANT.get(),
                SNAKE_PLANT.get(),
                SPIDER_PLANT.get(),
                CREEPING_FIG.get(),
                SESUVIUM.get(),
                GLASSWORT.get(),
                BARREL_CACTUS.get(),
                NIPA_PALM.get(),
                ELEPHANT_EAR.get(),
                YARROW.get(),
                YUCCA.get(),
                BRACKEN_FERNS.get(),
                LAVA_CACTUS.get(),
                SALT_BUSH.get(),
                BOG_ROSEMARY.get(),
                PRICKLY_PEAR.get()
        );
    }
}
