package xyz.sillyjune.biologica.world.features;


import com.mojang.serialization.Codec;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.world.features.configurations.StructureFeatureConfiguration;


public class StructureFeature extends Feature<StructureFeatureConfiguration> {


    public StructureFeature(Codec<StructureFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
        RandomSource random = context.random();
        WorldGenLevel worldGenLevel = context.level();
        StructureFeatureConfiguration config = context.config();
        Rotation rotation = config.randomRotation() ? Rotation.getRandom(random) : Rotation.NONE;
        Mirror mirror = config.randomMirror() ? Mirror.values()[random.nextInt(2)] : Mirror.NONE;
        BlockPos placePos = context.origin().offset(config.offset());
        StructureTemplateManager structureManager = worldGenLevel.getLevel().getStructureManager();
        StructureTemplate template = structureManager.getOrCreate(config.structure());
        StructurePlaceSettings placeSettings = (new StructurePlaceSettings()).setRotation(rotation).setMirror(mirror).setRandom(random).setIgnoreEntities(false).addProcessor(new BlockIgnoreProcessor(config.ignoredBlocks().stream().map(Holder::value).toList()));
        template.placeInWorld(worldGenLevel, placePos, placePos, placeSettings, random, 4);
        return true;
    }


}