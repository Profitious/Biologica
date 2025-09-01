package xyz.sillyjune.biologica.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import xyz.sillyjune.biologica.Biologica;

import java.util.ArrayList;
import java.util.List;

public class BiomeRegistry {

    public static List<ResourceKey<Biome>> overworldBiomes = new ArrayList<>();

    public static final ResourceKey<Biome> ALAKAI = registerOverworldBiome("alakai");
    public static final ResourceKey<Biome> ARID_SHRUBLAND = registerOverworldBiome("arid_shrubland");
    public static final ResourceKey<Biome> BOG = registerOverworldBiome("bog");
    public static final ResourceKey<Biome> CHAPPARAL = registerOverworldBiome("chapparal");
    public static final ResourceKey<Biome> COLD_WASTELAND = registerOverworldBiome("cold_wasteland");
    public static final ResourceKey<Biome> HAWWIAN_JUNGLE = registerOverworldBiome("hawwian_jungle");
    public static final ResourceKey<Biome> HILL_COUNTRY = registerOverworldBiome("hill_country");
    public static final ResourceKey<Biome> HIMILAYAS = registerOverworldBiome("himilayas");
    public static final ResourceKey<Biome> JURRASIC_FLATLANDS = registerOverworldBiome("jurrasic_flatlands");
    public static final ResourceKey<Biome> PANTANAL = registerOverworldBiome("pantanal");
    public static final ResourceKey<Biome> STEPPE = registerOverworldBiome("steppe");
    public static final ResourceKey<Biome> TEMPERATE_RAINFOREST = registerOverworldBiome("temperate_rainforest");
    public static final ResourceKey<Biome> TEMPERATE_SHRUBLAND = registerOverworldBiome("temperate_shrubland");
    public static final ResourceKey<Biome> TROPICAL_DRY_FOREST = registerOverworldBiome("tropical_dry_forest");
    public static final ResourceKey<Biome> VOLCANIC_WASTES = registerOverworldBiome("volcanic_wastes");


    private static ResourceKey<Biome> registerOverworldBiome(String name){
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(Biologica.MOD_ID, name));
        overworldBiomes.add(key);
        return key;
    }
}
