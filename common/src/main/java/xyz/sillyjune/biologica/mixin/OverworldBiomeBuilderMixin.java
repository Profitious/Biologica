package xyz.sillyjune.biologica.mixin;

import java.util.function.Consumer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.datafixers.util.Pair;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import xyz.sillyjune.biologica.index.BiologicaBiomes;

@Mixin(OverworldBiomeBuilder.class)
public class OverworldBiomeBuilderMixin {

    //change parameters very carefully, otherwise biome will be gone due to value conflict.
    @Inject(method = "addInlandBiomes", at = @At("HEAD"))
    private void addInlandBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> consumer, CallbackInfo ci) {
    	this.addSurfaceBiome(consumer, Climate.Parameter.span(0.55F, 1.0F), Climate.Parameter.span(0.222F, 0.888F), Climate.Parameter.span(0.3F, 1.0F), Climate.Parameter.span(-0.78F, -0.375F), Climate.Parameter.span(-1.0F, 1.0F), 0.0F, BiologicaBiomes.ALAKAI);
    }

    @Shadow
    private void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> consumer, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter depth, float weirdness, ResourceKey<Biome> key) {
    	
    }
}
