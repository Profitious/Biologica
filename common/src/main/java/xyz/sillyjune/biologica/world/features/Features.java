package xyz.sillyjune.biologica.world.features;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.world.features.configurations.StructureFeatureConfiguration;

public class Features {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Biologica.MOD_ID, Registries.FEATURE);
    public static final RegistrySupplier<Feature<?>> STRUCTURE_FEATURE = FEATURES.register("structure_feature", () -> new StructureFeature(StructureFeatureConfiguration.CODEC));
    
    
    public static void register(){FEATURES.register();}
}
