package xyz.sillyjune.biologica.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import static xyz.sillyjune.biologica.block.BiologicaBlocks.ALOE_VERA;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.BARREL_CACTUS;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.BLUE_BONNET;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.BOG_ROSEMARY;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.BOSTON_FERN;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.BRACKEN_FERNS;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.CRANBERRY_BUSH;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.CREEPING_FIG;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.DRACAENA;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.ELEPHANT_EAR;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.FLAMINGO_FLOWER;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.GLASSWORT;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.HELICONIA;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.HORSETAILS;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.LAVA_CACTUS;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.LAVENDER;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.NIPA_PALM;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.OCOTILLO;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.PEACE_LILY;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.PRICKLY_PEAR;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.RUBBER_PLANT;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.SALT_BUSH;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.SESUVIUM;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.SNAKE_PLANT;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.SPIDER_PLANT;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.YARROW;
import static xyz.sillyjune.biologica.block.BiologicaBlocks.YUCCA;

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
