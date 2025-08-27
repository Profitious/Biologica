package xyz.sillyjune.biologica;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Food.*;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MAMMOTH_MEAT = ITEMS.register("mammoth_meat", () -> new Item(new Item.Properties().food(MAMMOTH_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_MAMMOTH_MEAT = ITEMS.register("raw_mammoth_meat", () -> new Item(new Item.Properties().food(RAW_MAMMOTH_MEAT_FOOD)));

    public static final RegistrySupplier<Item> MAHI_MAHI_MEAT = ITEMS.register("mahi_mahi_meat", () -> new Item(new Item.Properties().food(MAHI_MAHI_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_MAHI_MAHI_MEAT = ITEMS.register("raw_mahi_mahi_meat", () -> new Item(new Item.Properties().food(RAW_MAHI_MAHI_MEAT_FOOD)));

    public static final RegistrySupplier<Item> SAUROPOD_MEAT = ITEMS.register("sauropod_meat", () -> new Item(new Item.Properties().food(SAUROPOD_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_SAUROPOD_MEAT = ITEMS.register("raw_sauropod_meat", () -> new Item(new Item.Properties().food(RAW_SAUROPOD_MEAT_FOOD)));

    public static final RegistrySupplier<Item> ELEPHANT_MEAT = ITEMS.register("elephant_meat", () -> new Item(new Item.Properties().food(ELEPHANT_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_ELEPHANT_MEAT = ITEMS.register("raw_elephant_meat", () -> new Item(new Item.Properties().food(RAW_ELEPHANT_MEAT_FOOD)));

    public static final RegistrySupplier<Item> SHARK_MEAT = ITEMS.register("shark_meat", () -> new Item(new Item.Properties().food(SHARK_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_SHARM_MEAT = ITEMS.register("raw_shark_meat", () -> new Item(new Item.Properties().food(RAW_SHARK_MEAT_FOOD)));

    public static final RegistrySupplier<Item> DINOSAUR_MEAT = ITEMS.register("dinosaur_meat", () -> new Item(new Item.Properties().food(DINOSAUR_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_DINOSAUR_MEAT = ITEMS.register("raw_dinosaur_meat", () -> new Item(new Item.Properties().food(RAW_DINOSAUR_MEAT_FOOD)));

    public static final RegistrySupplier<Item> BEAR_MEAT = ITEMS.register("bear_meat", () -> new Item(new Item.Properties().food(BEAR_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_BEAR_MEAT = ITEMS.register("raw_bear_meat", () -> new Item(new Item.Properties().food(RAW_BEAR_MEAT_FOOD)));

    public static final RegistrySupplier<Item> ELK_MEAT = ITEMS.register("elk_meat", () -> new Item(new Item.Properties().food(ELK_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_ELK_MEAT = ITEMS.register("raw_elk_meat", () -> new Item(new Item.Properties().food(RAW_ELK_MEAT_FOOD)));

    public static final RegistrySupplier<Item> TERROR_BIRD_MEAT = ITEMS.register("terror_bird_meat", () -> new Item(new Item.Properties().food(TERROR_BIRD_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_TERROR_BIRD_MEAT = ITEMS.register("raw_terror_bird_meat", () -> new Item(new Item.Properties().food(RAW_TERROR_BIRD_MEAT_FOOD)));

    public static final RegistrySupplier<Item> CRANBERRY_STEW = ITEMS.register("cranberry_stew", () -> new Item(new Item.Properties().food(CRANBERRY_STEW_FOOD)));

    public static final RegistrySupplier<Item> OX_HORN = ITEMS.register("ox_horn", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> FANG = ITEMS.register("fang", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CHITIN = ITEMS.register("chitin", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RHINO_HORN = ITEMS.register("rhino_horn", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> PUFFIN_BEAK = ITEMS.register("puffin_beak", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RATTLE = ITEMS.register("rattle", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> SHARK_FIN = ITEMS.register("shark_fin", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> MICRORAPTOR_FEATHER = ITEMS.register("microraptor_feather", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CLAW = ITEMS.register("claw", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> ANTLERS = ITEMS.register("antlers", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> TERROR_BIRD_FEATHER = ITEMS.register("terror_bird_feather", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> MACUHALUTI = ITEMS.register("machuhaluti", () -> new SwordItem(Tiers.MACUHALUTI_TIER, 0, -2.0f, new Item.Properties()));
    public static final RegistrySupplier<Item> CLAW_SWORD = ITEMS.register("claw_sword", () -> new SwordItem(Tiers.CLAW_TIER, 0, -2.0f, new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
