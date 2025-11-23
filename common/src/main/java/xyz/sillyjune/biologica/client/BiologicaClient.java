package xyz.sillyjune.biologica.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import xyz.sillyjune.biologica.client.model.BiologicaEntityModelLayers;
import xyz.sillyjune.biologica.client.renderer.entity.ParrotfishEntityRenderer;
import xyz.sillyjune.biologica.index.BiologicaEntityTypes;

public final class BiologicaClient {
    public static void init() {
        BiologicaEntityModelLayers.register();
        registerEntityRenderers();
    }

    private static void registerEntityRenderers() {
        EntityRendererRegistry.register(BiologicaEntityTypes.PARROTFISH, ParrotfishEntityRenderer::new);
    }
}
