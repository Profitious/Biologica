package xyz.sillyjune.biologica.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import xyz.sillyjune.biologica.client.BiologicaClient;

import static xyz.sillyjune.biologica.index.BiologicaBlocks.ALOE_VERA;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.BARREL_CACTUS;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.BLUE_BONNET;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.BOG_ROSEMARY;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.BOSTON_FERN;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.BRACKEN_FERNS;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.CRANBERRY_BUSH;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.CREEPING_FIG;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.DRACAENA;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.ELEPHANT_EAR;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.FLAMINGO_FLOWER;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.GLASSWORT;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.HELICONIA;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.HORSETAILS;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.LAVA_CACTUS;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.LAVENDER;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.NIPA_PALM;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.OCOTILLO;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.PEACE_LILY;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.PRICKLY_PEAR;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.RUBBER_PLANT;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.SALT_BUSH;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.SESUVIUM;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.SNAKE_PLANT;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.SPIDER_PLANT;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.YARROW;
import static xyz.sillyjune.biologica.index.BiologicaBlocks.YUCCA;

public final class BiologicaFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BiologicaClient.init();

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
