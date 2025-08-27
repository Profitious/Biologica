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
import xyz.sillyjune.biologica.Block.CranberryBushBlock;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Food.CRANBERRIES_FOOD;
import static xyz.sillyjune.biologica.Items.ITEMS;
import static xyz.sillyjune.biologica.Util.Tabs.FOOD_TAB;
import static xyz.sillyjune.biologica.Util.Tabs.NATURE_TAB;

public class Blocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    public static RegistrySupplier<Block> BOSTON_FERN = BLOCKS.register("boston_fern", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> BOSTON_FERN_ITEM = ITEMS.register("boston_fern", () -> new BlockItem(BOSTON_FERN.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> BLUE_BONNET = BLOCKS.register("blue_bonnet", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> BLUE_BONNET_ITEM = ITEMS.register("blue_bonnet", () -> new BlockItem(BLUE_BONNET.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> HELICONIA = BLOCKS.register("heliconia", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> HELICONIA_ITEM = ITEMS.register("heliconia", () -> new BlockItem(HELICONIA.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> PEACE_LILY = BLOCKS.register("peace_lily", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> PEACE_LILY_ITEM = ITEMS.register("peace_lily", () -> new BlockItem(PEACE_LILY.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> FLAMINGO_FLOWER = BLOCKS.register("flamingo_flower", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> FLAMINGO_FLOWER_ITEM = ITEMS.register("flamingo_flower", () -> new BlockItem(FLAMINGO_FLOWER.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush", () -> new CranberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new BlockItem(CRANBERRY_BUSH.get(), new Item.Properties().food(CRANBERRIES_FOOD).arch$tab(FOOD_TAB)));

    public static void register() {
        BLOCKS.register();
    }
}
