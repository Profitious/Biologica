package xyz.sillyjune.biologica.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import org.intellij.lang.annotations.Identifier;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;
import xyz.sillyjune.biologica.Biologica;
import net.fabricmc.api.ModInitializer;
import xyz.sillyjune.biologica.world.PrimaryBiologicaOverworldRegion;

import java.util.function.Predicate;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;

public final class BiologicaFabric implements ModInitializer, TerraBlenderApi {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Biologica.init();
    }

    @Override
    public void onTerraBlenderInitialized()
    {
        // Weights are kept intentionally low as we add minimal biomes
        Regions.register(new PrimaryBiologicaOverworldRegion(new ResourceLocation(MOD_ID, "overworld1"), 10));
    }
}
