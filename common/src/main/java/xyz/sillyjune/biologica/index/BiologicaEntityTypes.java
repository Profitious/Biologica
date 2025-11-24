package xyz.sillyjune.biologica.index;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.entity.ParrotfishEntity;

import java.util.function.Supplier;

public class BiologicaEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Biologica.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<ParrotfishEntity>> PARROTFISH = register("parrotfish", () ->
            EntityType.Builder.of(ParrotfishEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.7F)
                    .clientTrackingRange(4)
    );

    static void register() {
        ENTITIES.register();
        registerAttributes();
    }

    private static void registerAttributes() {
        EntityAttributeRegistry.register(PARROTFISH, ParrotfishEntity::createAttributes);
    }

    private static <T extends Entity> RegistrySupplier<EntityType<T>> register(String id, Supplier<EntityType.Builder<T>> factory) {
        String fullId = new ResourceLocation(Biologica.MOD_ID, id).toString();
        return ENTITIES.register(id, () -> factory.get().build(fullId));
    }
}
