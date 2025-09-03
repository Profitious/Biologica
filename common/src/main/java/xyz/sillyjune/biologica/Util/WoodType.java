package xyz.sillyjune.biologica.Util;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static xyz.sillyjune.biologica.Blocks.BLOCKS;
import static xyz.sillyjune.biologica.Items.ITEMS;
import static xyz.sillyjune.biologica.Util.Tabs.BLOCKS_TAB;

public class WoodType {

    public WoodType(String id) {
        RegistrySupplier<Block> LOG = BLOCKS.register(id+"_log", WoodType::newLog);
        RegistrySupplier<Item> LOG_ITEM = ITEMS.register(id+"_log", () -> new BlockItem(LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> STRIPPED_LOG = BLOCKS.register(id+"_log_stripped", WoodType::newLog);
        RegistrySupplier<Item> STRIPPED_LOG_ITEM = ITEMS.register(id+"_log_stripped", () -> new BlockItem(STRIPPED_LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> PLANK = BLOCKS.register(id+"_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
        RegistrySupplier<Item> PLANK_ITEM = ITEMS.register(id+"_planks", () -> new BlockItem(PLANK.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> LEAVES = BLOCKS.register(id+"_leaves", () -> newLeaves(SoundType.GRASS));
        RegistrySupplier<Item> LEAVES_ITEM = ITEMS.register(id+"_leaves", () -> new BlockItem(LEAVES.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> STAIR = BLOCKS.register(id+"_stairs", () -> new StairBlock(PLANK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PLANK.get())));
        RegistrySupplier<Item> STAIR_ITEM = ITEMS.register(id+"_stairs", () -> new BlockItem(STAIR.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> SLAB = BLOCKS.register(id+"_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
        RegistrySupplier<Item> SLAB_ITEM = ITEMS.register(id+"_slab", () -> new BlockItem(SLAB.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> FENCE = BLOCKS.register(id+"_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(PLANK.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
        RegistrySupplier<Item> FENCE_ITEM = ITEMS.register(id+"_fence", () -> new BlockItem(FENCE.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> FENCE_GATE = BLOCKS.register(id+"_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(PLANK.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), net.minecraft.world.level.block.state.properties.WoodType.OAK));
        RegistrySupplier<Item> FENCE_GATE_ITEM = ITEMS.register(id+"_fence_gate", () -> new BlockItem(FENCE_GATE.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> DOOR = BLOCKS.register(id+"_door", () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(PLANK.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
        RegistrySupplier<Item> DOOR_ITEM = ITEMS.register(id+"_door", () -> new BlockItem(DOOR.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> SIGN = BLOCKS.register(id+"_sign", () -> new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), net.minecraft.world.level.block.state.properties.WoodType.OAK));
        RegistrySupplier<Item> SIGN_ITEM = ITEMS.register(id+"_sign", () -> new BlockItem(SIGN.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> HANGING_SIGN = BLOCKS.register(id+"_hanging_sign", () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(PLANK.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), net.minecraft.world.level.block.state.properties.WoodType.OAK));
        RegistrySupplier<Item> HANGING_SIGN_ITEM = ITEMS.register(id+"_hanging_sign", () -> new BlockItem(HANGING_SIGN.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> TRAPDOOR = BLOCKS.register(id+"_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava(), BlockSetType.OAK));
        RegistrySupplier<Item> TRAPDOOR_ITEM = ITEMS.register(id+"_trapdoor", () -> new BlockItem(TRAPDOOR.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> PRESSURE_PLATE = BLOCKS.register(id+"_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(PLANK.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
        RegistrySupplier<Item> PRESSURE_PLATE_ITEM = ITEMS.register(id+"_pressure_plate", () -> new BlockItem(PRESSURE_PLATE.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> BUTTON = BLOCKS.register(id+"_button", () -> woodenButton(BlockSetType.OAK));
        RegistrySupplier<Item> BUTTON_ITEM = ITEMS.register(id+"_button", () -> new BlockItem(BUTTON.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));

    }
    private static RotatedPillarBlock newLog() {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }
    public static LeavesBlock newLeaves(SoundType soundType) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(soundType).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }
    public static ButtonBlock woodenButton(BlockSetType setType, FeatureFlag... requiredFeatures) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
        if (requiredFeatures.length > 0) {
            properties = properties.requiredFeatures(requiredFeatures);
        }
        return new ButtonBlock(properties, setType, 30, true);
    }
}

