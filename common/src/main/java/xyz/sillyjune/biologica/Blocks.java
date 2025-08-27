package xyz.sillyjune.biologica;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import static net.minecraft.world.item.Items.registerItem;
import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Items.ITEMS;

public class Blocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    public static RegistrySupplier<Block> BOSTON_FERN = BLOCKS.register("boston_fern", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> BOSTON_FERN_ITEM = ITEMS.register("boston_fern", () -> new BlockItem(BOSTON_FERN.get(), new Item.Properties()));
    public static void register() {
        BLOCKS.register();
    }
}
