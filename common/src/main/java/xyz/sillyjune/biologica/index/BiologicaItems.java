package xyz.sillyjune.biologica.index;

import dev.architectury.core.item.ArchitecturySpawnEggItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.block.Block;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.item.BiologicaFood;
import xyz.sillyjune.biologica.util.BiologicaInstrumentTags;
import xyz.sillyjune.biologica.util.BiologicaTiers;

import java.util.function.Consumer;
import java.util.function.Function;

public class BiologicaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Biologica.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MAMMOTH_MEAT = register("mammoth_meat", BiologicaFood.MAMMOTH_MEAT);
    public static final RegistrySupplier<Item> RAW_MAMMOTH_MEAT = register("raw_mammoth_meat", BiologicaFood.RAW_MAMMOTH_MEAT_FOOD);

    public static final RegistrySupplier<Item> MAHI_MAHI_MEAT = register("mahi_mahi_meat", BiologicaFood.MAHI_MAHI_MEAT);
    public static final RegistrySupplier<Item> RAW_MAHI_MAHI_MEAT = register("raw_mahi_mahi_meat", BiologicaFood.RAW_MAHI_MAHI_MEAT);

    public static final RegistrySupplier<Item> SAUROPOD_MEAT = register("sauropod_meat", BiologicaFood.SAUROPOD_MEAT);
    public static final RegistrySupplier<Item> RAW_SAUROPOD_MEAT = register("raw_sauropod_meat", BiologicaFood.RAW_SAUROPOD_MEAT);

    public static final RegistrySupplier<Item> ELEPHANT_MEAT = register("elephant_meat", BiologicaFood.ELEPHANT_MEAT);
    public static final RegistrySupplier<Item> RAW_ELEPHANT_MEAT = register("raw_elephant_meat", BiologicaFood.RAW_ELEPHANT_MEAT);

    public static final RegistrySupplier<Item> SHARK_MEAT = register("shark_meat", BiologicaFood.SHARK_MEAT);
    public static final RegistrySupplier<Item> RAW_SHARM_MEAT = register("raw_shark_meat", BiologicaFood.RAW_SHARK_MEAT);

    public static final RegistrySupplier<Item> DINOSAUR_MEAT = register("dinosaur_meat", BiologicaFood.DINOSAUR_MEAT);
    public static final RegistrySupplier<Item> RAW_DINOSAUR_MEAT = register("raw_dinosaur_meat", BiologicaFood.RAW_DINOSAUR_MEAT);

    public static final RegistrySupplier<Item> BEAR_MEAT = register("bear_meat", BiologicaFood.BEAR_MEAT);
    public static final RegistrySupplier<Item> RAW_BEAR_MEAT = register("raw_bear_meat", BiologicaFood.RAW_BEAR_MEAT);

    public static final RegistrySupplier<Item> ELK_MEAT = register("elk_meat", BiologicaFood.ELK_MEAT);
    public static final RegistrySupplier<Item> RAW_ELK_MEAT = register("raw_elk_meat", BiologicaFood.RAW_ELK_MEAT);

    public static final RegistrySupplier<Item> TERROR_BIRD_MEAT = register("terror_bird_meat", BiologicaFood.TERROR_BIRD_MEAT);
    public static final RegistrySupplier<Item> RAW_TERROR_BIRD_MEAT = register("raw_terror_bird_meat", BiologicaFood.RAW_TERROR_BIRD_MEAT);

    public static final RegistrySupplier<Item> CRANBERRY_STEW = register("cranberry_stew", BiologicaFood.CRANBERRY_STEW_FOOD);

    public static final RegistrySupplier<Item> CACTUS_STEW = register("cactus_stew", BiologicaFood.CACTUS_STEW);

    public static final RegistrySupplier<Item> PRICKLY_PEAR_FRUIT = register("prickly_pear_fruit", BiologicaFood.PRICKLY_PEAR_FRUIT);

    public static final RegistrySupplier<Item> NOPAL = register("nopal", BiologicaFood.NOPAL);

    public static final RegistrySupplier<Item> OX_HORN = register("ox_horn", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> FANG = register("fang", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> CHITIN = register("chitin", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> RHINO_HORN = register("rhino_horn", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> PUFFIN_BEAK = register("puffin_beak", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> RATTLE = register("rattle", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> SHARK_FIN = register("shark_fin", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> MICRORAPTOR_FEATHER = register("microraptor_feather", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> CLAW = register("claw", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> ANTLERS = register("antlers", BiologicaCreativeModeTabs.CRAFTING);
    public static final RegistrySupplier<Item> TERROR_BIRD_FEATHER = register("terror_bird_feather", BiologicaCreativeModeTabs.CRAFTING);

    public static final RegistrySupplier<Item> MARACAS = register("maracas", p -> new InstrumentItem(p, BiologicaInstrumentTags.MARACAS), BiologicaCreativeModeTabs.TOOLS, properties -> properties.stacksTo(1));
    public static final RegistrySupplier<Item> MACUHALUTI = register("machuhaluti", p -> new SwordItem(BiologicaTiers.MACUHALUTI_TIER, 0, -2.0f, p), BiologicaCreativeModeTabs.TOOLS);
    public static final RegistrySupplier<Item> CLAW_SWORD = register("claw_sword", p -> new SwordItem(BiologicaTiers.CLAW_TIER, 0, -2.0f, p), BiologicaCreativeModeTabs.TOOLS);

    public static final RegistrySupplier<BlockItem> BOSTON_FERN = register(BiologicaBlocks.BOSTON_FERN, BiologicaCreativeModeTabs.NATURE);

    public static final RegistrySupplier<BlockItem> BLOODROOT = register(BiologicaBlocks.BLOODROOT, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> BLUE_BONNET = register(BiologicaBlocks.BLUE_BONNET, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> HELICONIA = register(BiologicaBlocks.HELICONIA, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> PEACE_LILY = register(BiologicaBlocks.PEACE_LILY, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> FLAMINGO_FLOWER = register(BiologicaBlocks.FLAMINGO_FLOWER, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> LAVENDER = register(BiologicaBlocks.LAVENDER, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> OCOTILLO = register(BiologicaBlocks.OCOTILLO, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> HORSETAILS = register(BiologicaBlocks.HORSETAILS, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> DRACAENA = register(BiologicaBlocks.DRACAENA, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> ALOE_VERA = register(BiologicaBlocks.ALOE_VERA, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> RUBBER_PLANT = register(BiologicaBlocks.RUBBER_PLANT, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> CRANBERRIES = register("cranberries", BiologicaBlocks.CRANBERRY_BUSH, BiologicaFood.CRANBERRIES);
    public static final RegistrySupplier<BlockItem> SNAKE_PLANT = register(BiologicaBlocks.SNAKE_PLANT, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> SPIDER_PLANT = register(BiologicaBlocks.SPIDER_PLANT, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> CREEPING_FIG = register(BiologicaBlocks.CREEPING_FIG, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> SESUVIUM = register(BiologicaBlocks.SESUVIUM, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> GLASSWORT = register(BiologicaBlocks.GLASSWORT, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> BARREL_CACTUS = register(BiologicaBlocks.BARREL_CACTUS, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> NIPA_PALM = register(BiologicaBlocks.NIPA_PALM, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> ELEPHANT_EAR = register(BiologicaBlocks.ELEPHANT_EAR, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> YARROW = register(BiologicaBlocks.YARROW, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> YUCCA = register(BiologicaBlocks.YUCCA, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> BRACKEN_FERNS = register(BiologicaBlocks.BRACKEN_FERNS, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> LAVA_CACTUS = register(BiologicaBlocks.LAVA_CACTUS, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> SALT_BUSH = register(BiologicaBlocks.SALT_BUSH, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> BOG_ROSEMARY = register(BiologicaBlocks.BOG_ROSEMARY, BiologicaCreativeModeTabs.NATURE);
    public static final RegistrySupplier<BlockItem> VOLCANIC_COBBLESTONE = register(BiologicaBlocks.VOLCANIC_COBBLESTONE);
    public static final RegistrySupplier<BlockItem> VOLCANIC_STONE = register(BiologicaBlocks.VOLCANIC_STONE);
    public static final RegistrySupplier<BlockItem> LIMESTONE = register(BiologicaBlocks.LIMESTONE);
    public static final RegistrySupplier<BlockItem> LIMESTONE_GRAVEL = register(BiologicaBlocks.LIMESTONE_GRAVEL);

    public static final RegistrySupplier<SpawnEggItem> PARROTFISH_SPAWN_EGG = register("parrotfish_spawn_egg", p -> new ArchitecturySpawnEggItem(BiologicaEntityTypes.PARROTFISH, 0, 0, p), new Item.Properties().arch$tab(CreativeModeTabs.SPAWN_EGGS));

    static void register() {
        ITEMS.register();
    }

    private static <T extends Item> RegistrySupplier<T> register(String id, Function<Item.Properties, T> factory, Item.Properties properties) {
        return ITEMS.register(id, () -> factory.apply(properties));
    }

    private static <T extends Item> RegistrySupplier<T> register(String id, Function<Item.Properties, T> factory, RegistrySupplier<CreativeModeTab> tab, Consumer<Item.Properties> propertiesFactory) {
        Item.Properties properties = new Item.Properties().arch$tab(tab);
        propertiesFactory.accept(properties);
        return register(id, factory, properties);
    }

    private static <T extends Item> RegistrySupplier<T> register(String id, Function<Item.Properties, T> factory, RegistrySupplier<CreativeModeTab> tab) {
        return register(id, factory, tab, properties -> {});
    }

    private static RegistrySupplier<Item> register(String id, RegistrySupplier<CreativeModeTab> tab) {
        return register(id, Item::new, tab);
    }

    private static RegistrySupplier<Item> register(String id, FoodProperties food) {
        return register(id, Item::new, BiologicaCreativeModeTabs.FOOD, properties -> properties.food(food));
    }

    private static RegistrySupplier<BlockItem> register(String id, RegistrySupplier<Block> block, RegistrySupplier<CreativeModeTab> tab, Consumer<Item.Properties> properties) {
        return register(id, p -> new BlockItem(block.get(), p), tab, properties);
    }

    private static RegistrySupplier<BlockItem> register(RegistrySupplier<Block> block, RegistrySupplier<CreativeModeTab> tab) {
        return register(block.getKey().location().getPath(), block, tab, properties -> {});
    }

    public static RegistrySupplier<BlockItem> register(RegistrySupplier<Block> block) {
        return register(block, BiologicaCreativeModeTabs.BLOCKS);
    }

    private static RegistrySupplier<BlockItem> register(String id, RegistrySupplier<Block> block, FoodProperties food) {
        return register(id, block, BiologicaCreativeModeTabs.FOOD, p -> p.food(food));
    }
}
