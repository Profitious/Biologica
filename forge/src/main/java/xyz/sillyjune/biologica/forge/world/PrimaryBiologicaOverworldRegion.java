package xyz.sillyjune.biologica.forge.world;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;
import xyz.sillyjune.biologica.world.BiomeRegistry;

import java.util.List;
import java.util.function.Consumer;

public class PrimaryBiologicaOverworldRegion extends Region {
    public PrimaryBiologicaOverworldRegion(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }



    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {


        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        List<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> biomes = List.of(
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.2F, 0.7F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L),BiomeRegistry.HAWWIAN_JUNGLE),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.2F, 0.7F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.HAWWIAN_JUNGLE),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.COLD_WASTELAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.COLD_WASTELAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, -0.25F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.STEPPE),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, -0.25F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.STEPPE),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.35F, 0.9F), Climate.Parameter.span(-0.7F, 0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.HILL_COUNTRY),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.35F, 0.9F), Climate.Parameter.span(-0.7F, 0.5F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.HILL_COUNTRY),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.31F, 1.0F), Climate.Parameter.span(-1.0F, 0.7F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.0F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TROPICAL_DRY_FOREST),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.31F, 1.0F), Climate.Parameter.span(-1.0F, 0.7F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.0F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TROPICAL_DRY_FOREST),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.2F), Climate.Parameter.span(-0.5F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TEMPERATE_SHRUBLAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.2F), Climate.Parameter.span(-0.5F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TEMPERATE_SHRUBLAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(0.8F, 1.0F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.HIMILAYAS),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(0.8F, 1.0F), Climate.Parameter.span(-1.0F, -0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.HIMILAYAS),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(0.5F, 1.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TEMPERATE_RAINFOREST),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(0.5F, 1.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.TEMPERATE_RAINFOREST),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.0F, 0.5F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.CHAPPARAL),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.0F, 0.5F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.CHAPPARAL),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.ARID_SHRUBLAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.ARID_SHRUBLAND),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.2F, 0.7F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.span(0.0F, 0.3F), Climate.Parameter.span(0.1F, 0.4F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.PANTANAL),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.2F, 0.7F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.span(0.0F, 0.3F), Climate.Parameter.span(0.1F, 0.4F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.PANTANAL),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, -0.25F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-0.19F, -0.11F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.BOG),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, -0.25F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-0.19F, -0.11F), Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.BOG),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.25F, 0.66F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(-0.11F, 0.55F), Climate.Parameter.span(-0.5001F, 0.0F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.JURRASIC_FLATLANDS),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.25F, 0.66F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(-0.11F, 0.55F), Climate.Parameter.span(-0.5001F, 0.0F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.JURRASIC_FLATLANDS),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.25F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.VOLCANIC_WASTES),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-1.0F, 0.0F), Climate.Parameter.span(0.25F, 1.0F), Climate.Parameter.span(0.0F, 1.0F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.VOLCANIC_WASTES),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 0.75F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(0.5F, 1.0F), Climate.Parameter.span(0.6F, 1.0F), Climate.Parameter.point(0.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.ALAKAI),
        Pair.of(new Climate.ParameterPoint(Climate.Parameter.span(0.3F, 0.75F), Climate.Parameter.span(0.4999F, 1.0F), Climate.Parameter.span(0.5F, 1.0F), Climate.Parameter.span(0.6F, 1.0F), Climate.Parameter.point(1.0F), Climate.Parameter.span(-1.0F, 1.0F), 0L), BiomeRegistry.ALAKAI)
        );

        biomes.forEach( p-> builder.add(p.getFirst(), p.getSecond()));
        builder.build().forEach(mapper);



    }

}
