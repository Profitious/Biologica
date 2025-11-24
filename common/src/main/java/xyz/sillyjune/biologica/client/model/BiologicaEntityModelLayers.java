package xyz.sillyjune.biologica.client.model;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.client.model.entity.ParrotfishEntityModel;

public class BiologicaEntityModelLayers {
    public static ModelLayerLocation PARROTFISH = create("parrotfish");

    public static void register() {
        EntityModelLayerRegistry.register(PARROTFISH, ParrotfishEntityModel::createBodyLayer);
    }

    private static ModelLayerLocation create(String id) {
        return new ModelLayerLocation(new ResourceLocation(Biologica.MOD_ID, id), "main");
    }
}
