package xyz.sillyjune.biologica.index;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;
import xyz.sillyjune.biologica.Biologica;

public class BiologicaIndex {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(Biologica.MOD_ID, Registries.BIOME);

    public static void register() {
        BIOMES.register();
    }
}

