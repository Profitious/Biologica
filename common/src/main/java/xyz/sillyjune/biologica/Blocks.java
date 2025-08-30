package xyz.sillyjune.biologica;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import xyz.sillyjune.biologica.Block.CranberryBushBlock;
import xyz.sillyjune.biologica.Block.OcotilloBlock;
import xyz.sillyjune.biologica.Util.WoodType;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Food.CRANBERRIES_FOOD;
import static xyz.sillyjune.biologica.Items.ITEMS;
import static xyz.sillyjune.biologica.Util.Tabs.*;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

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

    public static RegistrySupplier<Block> LAVENDER = BLOCKS.register("lavender", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> LAVENDER_ITEM = ITEMS.register("lavender", () -> new BlockItem(LAVENDER.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> OCOTILLO = BLOCKS.register("ocotillo", () -> new OcotilloBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> OCOTILLO_ITEM = ITEMS.register("ocotillo", () -> new BlockItem(OCOTILLO.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> HORSETAILS = BLOCKS.register("horsetails", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> HORSETAILS_ITEM = ITEMS.register("horsetails", () -> new BlockItem(HORSETAILS.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> DRACAENA = BLOCKS.register("dracaena", () -> new TallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> DRACAENA_ITEM = ITEMS.register("dracaena", () -> new BlockItem(DRACAENA.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> ALOE_VERA = BLOCKS.register("aloe_vera", () -> new DeadBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> ALOE_VERA_ITEM = ITEMS.register("aloe_vera", () -> new BlockItem(ALOE_VERA.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> RUBBER_PLANT = BLOCKS.register("rubber_plant", () -> new TallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static RegistrySupplier<Item> RUBBER_PLANT_ITEM = ITEMS.register("rubber_plant", () -> new BlockItem(RUBBER_PLANT.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush", () -> new CranberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new BlockItem(CRANBERRY_BUSH.get(), new Item.Properties().food(CRANBERRIES_FOOD).arch$tab(FOOD_TAB)));

    public static RegistrySupplier<Block> SNAKE_PLANT = BLOCKS.register("snake_plant", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> SNAKE_PLANT_ITEM = ITEMS.register("snake_plant", () -> new BlockItem(SNAKE_PLANT.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> SPIDER_PLANT = BLOCKS.register("spider_plant", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> SPIDER_PLANT_ITEM = ITEMS.register("spider_plant", () -> new BlockItem(SPIDER_PLANT.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> CREEPING_FIG = BLOCKS.register("creeping_fig", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> CREEPING_FIG_ITEM = ITEMS.register("creeping_fig", () -> new BlockItem(CREEPING_FIG.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> SESUVIUM = BLOCKS.register("sesuvium", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> SESUVIUM_ITEM = ITEMS.register("sesuvium", () -> new BlockItem(SESUVIUM.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> GLASSWORT = BLOCKS.register("glasswort", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> GLASSWORT_ITEM = ITEMS.register("glasswort", () -> new BlockItem(GLASSWORT.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> BARREL_CACTUS = BLOCKS.register("barrel_cactus", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> BARREL_CACTUS_ITEM = ITEMS.register("barrel_cactus", () -> new BlockItem(BARREL_CACTUS.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> PRICKLY_PEAR = BLOCKS.register("prickly_pear", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;

    public static RegistrySupplier<Block> NIPA_PALM = BLOCKS.register("nipa_palm", () -> new TallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> NIPA_PALM_ITEM = ITEMS.register("nipa_palm", () -> new BlockItem(NIPA_PALM.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> ELEPHANT_EAR = BLOCKS.register("elephant_ear", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> ELEPHANT_EAR_ITEM = ITEMS.register("elephant_ear", () -> new BlockItem(ELEPHANT_EAR.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> YARROW = BLOCKS.register("yarrow", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> YARROW_ITEM = ITEMS.register("yarrow", () -> new BlockItem(YARROW.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> YUCCA = BLOCKS.register("yucca", () -> new TallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> YUCCA_ITEM = ITEMS.register("yucca", () -> new BlockItem(YUCCA.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> BRACKEN_FERNS = BLOCKS.register("bracken_ferns", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> BRACKEN_FERNS_ITEM = ITEMS.register("bracken_ferns", () -> new BlockItem(BRACKEN_FERNS.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> LAVA_CACTUS = BLOCKS.register("lava_cactus", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> LAVA_CACTUS_ITEM = ITEMS.register("lava_cactus", () -> new BlockItem(LAVA_CACTUS.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> SALT_BUSH = BLOCKS.register("salt_bush", () -> new TallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> SALT_BUSH_ITEM = ITEMS.register("salt_bush", () -> new BlockItem(SALT_BUSH.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> BOG_ROSEMARY = BLOCKS.register("bog_rosemary", () -> new TallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));;
    public static final RegistrySupplier<Item> BOG_ROSEMARY_ITEM = ITEMS.register("bog_rosemary", () -> new BlockItem(BOG_ROSEMARY.get(), new Item.Properties().arch$tab(NATURE_TAB)));

    public static RegistrySupplier<Block> VOLCANIC_COBBLESTONE = BLOCKS.register("volcanic_cobblestone", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistrySupplier<Item> VOLCANIC_COBBLESTONE_ITEM = ITEMS.register("volcanic_cobblestone", () -> new BlockItem(VOLCANIC_COBBLESTONE.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));

    public static RegistrySupplier<Block> VOLCANIC_STONE = BLOCKS.register("volcanic_stone", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistrySupplier<Item> VOLCANIC_STONE_ITEM = ITEMS.register("volcanic_stone", () -> new BlockItem(VOLCANIC_STONE.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));

    public static WoodType KOA_WOOD;
    public static void register() {
        KOA_WOOD = new WoodType("koa");
        BLOCKS.register();
    }
}
