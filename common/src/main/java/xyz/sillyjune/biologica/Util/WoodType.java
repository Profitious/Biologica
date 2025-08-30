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

    public WoodType(String id) {
        RegistrySupplier<Block> LOG = BLOCKS.register(id+"_log", WoodType::newLog);
        RegistrySupplier<Item> LOG_ITEM = ITEMS.register(id+"_log", () -> new BlockItem(LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> STRIPPED_LOG = BLOCKS.register(id+"_log_stripped", WoodType::newLog);
        RegistrySupplier<Item> STRIPPED_LOG_ITEM = ITEMS.register(id+"_log_stripped", () -> new BlockItem(STRIPPED_LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> PLANK = BLOCKS.register(id+"_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
        RegistrySupplier<Item> PLANK_ITEM = ITEMS.register(id+"_planks", () -> new BlockItem(PLANK.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
        RegistrySupplier<Block> LEAVES = BLOCKS.register(id+"_leaves", () -> newLeaves(SoundType.GRASS));
        RegistrySupplier<Item> LEAVES_ITEM = ITEMS.register(id+"_leaves", () -> new BlockItem(LEAVES.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
    }
    private static RotatedPillarBlock newLog() {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }
    public static LeavesBlock newLeaves(SoundType soundType) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(soundType).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }
}

