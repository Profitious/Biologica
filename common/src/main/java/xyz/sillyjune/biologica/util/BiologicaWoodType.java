package xyz.sillyjune.biologica.util;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.index.BiologicaBlocks;
import xyz.sillyjune.biologica.index.BiologicaItems;

public class BiologicaWoodType {
    public final Blocks blocks;
    public final Items items;

    public final WoodType woodType;
    public final BlockSetType blockSetType;

    public BiologicaWoodType(String id) {
        String setId = Biologica.MOD_ID+"_"+id;
        this.blockSetType = new BlockSetType(setId);
        this.woodType = new WoodType(setId, this.blockSetType);

        this.blocks = new Blocks(id, this.blockSetType, this.woodType);
        this.items = new Items(this.blocks);
    }

    public static class Blocks {
        public final RegistrySupplier<Block> log;
        public final RegistrySupplier<Block> strippedLog;
        public final RegistrySupplier<Block> planks;
        public final RegistrySupplier<Block> leaves;
        public final RegistrySupplier<Block> stairs;
        public final RegistrySupplier<Block> slab;
        public final RegistrySupplier<Block> fence;
        public final RegistrySupplier<Block> fenceGate;
        public final RegistrySupplier<Block> door;
        public final RegistrySupplier<Block> sign;
        public final RegistrySupplier<Block> hangingSign;
        public final RegistrySupplier<Block> trapdoor;
        public final RegistrySupplier<Block> pressurePlate;
        public final RegistrySupplier<Block> button;

        private Blocks(String id, BlockSetType blockSetType, WoodType woodType) {
            this.log = BiologicaBlocks.register(id+"_log", RotatedPillarBlock::new, BlockBehaviour.Properties.of().mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
            this.strippedLog = BiologicaBlocks.register("stripped_"+id+"_log", RotatedPillarBlock::new, BlockBehaviour.Properties.of().mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
            this.planks = BiologicaBlocks.register(id+"_planks", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava());
            this.leaves = BiologicaBlocks.register(id+"_leaves", LeavesBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
            this.stairs = BiologicaBlocks.register(id+"_stairs", () -> new StairBlock(planks.get().defaultBlockState(), BlockBehaviour.Properties.copy(planks.get())));
            this.slab = BiologicaBlocks.register(id+"_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava());
            this.fence = BiologicaBlocks.register(id+"_fence", FenceBlock::new, () -> BlockBehaviour.Properties.of().mapColor(planks.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava());
            this.fenceGate = BiologicaBlocks.register(id+"_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(planks.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), woodType));
            this.door = BiologicaBlocks.register(id+"_door", () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(planks.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), blockSetType));
            this.sign = BiologicaBlocks.register(id+"_sign", () -> new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), woodType));
            this.hangingSign = BiologicaBlocks.register(id+"_hanging_sign", () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(planks.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), woodType));
            this.trapdoor = BiologicaBlocks.register(id+"_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava(), blockSetType));
            this.pressurePlate = BiologicaBlocks.register(id+"_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(planks.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), blockSetType));
            this.button = BiologicaBlocks.register(id+"_button", () -> woodenButton(blockSetType));
        }

        public static ButtonBlock woodenButton(BlockSetType setType, FeatureFlag... requiredFeatures) {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY).requiredFeatures(requiredFeatures);
            return new ButtonBlock(properties, setType, 30, true);
        }
    }

    public static class Items {
        public final RegistrySupplier<BlockItem> log;
        public final RegistrySupplier<BlockItem> strippedLog;
        public final RegistrySupplier<BlockItem> planks;
        public final RegistrySupplier<BlockItem> leaves;
        public final RegistrySupplier<BlockItem> stairs;
        public final RegistrySupplier<BlockItem> slab;
        public final RegistrySupplier<BlockItem> fence;
        public final RegistrySupplier<BlockItem> fenceGate;
        public final RegistrySupplier<BlockItem> door;
        public final RegistrySupplier<BlockItem> sign;
        public final RegistrySupplier<BlockItem> hangingSign;
        public final RegistrySupplier<BlockItem> trapdoor;
        public final RegistrySupplier<BlockItem> pressurePlate;
        public final RegistrySupplier<BlockItem> button;

        private Items(Blocks blocks) {
            this.log = BiologicaItems.register(blocks.log);
            this.strippedLog = BiologicaItems.register(blocks.strippedLog);
            this.planks = BiologicaItems.register(blocks.planks);
            this.leaves = BiologicaItems.register(blocks.leaves);
            this.stairs = BiologicaItems.register(blocks.stairs);
            this.slab = BiologicaItems.register(blocks.slab);
            this.fence = BiologicaItems.register(blocks.fence);
            this.fenceGate = BiologicaItems.register(blocks.fenceGate);
            this.door = BiologicaItems.register(blocks.door);
            this.sign = BiologicaItems.register(blocks.sign);
            this.hangingSign = BiologicaItems.register(blocks.hangingSign);
            this.trapdoor = BiologicaItems.register(blocks.trapdoor);
            this.pressurePlate = BiologicaItems.register(blocks.pressurePlate);
            this.button = BiologicaItems.register(blocks.button);
        }
    }
}
