package xyz.sillyjune.biologica.Util;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
    public static RegistrySupplier<Block> PLANK;
    public static RegistrySupplier<Item> PLANK_ITEM;

    public static RegistrySupplier<Block> LOG;
    public static RegistrySupplier<Item> LOG_ITEM;

    public static RegistrySupplier<Block> STRIPPED_LOG;
    public static RegistrySupplier<Item> STRIPPED_LOG_ITEM;

    public static RegistrySupplier<Block> LEAVES;
    public static RegistrySupplier<Item> LEAVES_ITEM;

    private final String identifier;
    public WoodType(String id) {
        identifier = id;
        LOG = BLOCKS.register(identifier+"_log", WoodType::newLog);
        LOG_ITEM = ITEMS.register(identifier+"_log", () -> new BlockItem(LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        STRIPPED_LOG = BLOCKS.register(identifier+"_log_stripped", WoodType::newLog);
        STRIPPED_LOG_ITEM = ITEMS.register(identifier+"_log_stripped", () -> new BlockItem(STRIPPED_LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        PLANK = BLOCKS.register(identifier+"_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
        PLANK_ITEM = ITEMS.register(identifier+"_planks", () -> new BlockItem(PLANK.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        LEAVES = BLOCKS.register(identifier+"_leaves", () -> newLeaves(SoundType.GRASS));
        LEAVES_ITEM = ITEMS.register(identifier+"_leaves", () -> new BlockItem(LEAVES.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
    }
    private static RotatedPillarBlock newLog() {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }
    public static LeavesBlock newLeaves(SoundType soundType) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(soundType).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }

    public Block plank() { return PLANK.get(); }
    public Item plankItem() { return PLANK_ITEM.get(); }
    public Block log() { return LOG.get(); }
    public Item logItem() { return LOG_ITEM.get(); }
    public Block logStripped() { return STRIPPED_LOG.get(); }
    public Item logStrippedItem() { return STRIPPED_LOG_ITEM.get(); }
    public Block leaves() { return LEAVES.get(); }
    public Item leavesItem() { return LEAVES_ITEM.get(); }
}

