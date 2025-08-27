package xyz.sillyjune.biologica;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Food.*;

public class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MAMMOTH_MEAT = ITEMS.register("mammoth_meat", () -> new Item(new Item.Properties().food(MAMMOTH_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_MAMMOTH_MEAT = ITEMS.register("raw_mammoth_meat", () -> new Item(new Item.Properties().food(RAW_MAMMOTH_MEAT_FOOD)));

    public static final RegistrySupplier<Item> MAHI_MAHI_MEAT = ITEMS.register("mahi_mahi_meat", () -> new Item(new Item.Properties().food(MAHI_MAHI_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_MAHI_MAHI_MEAT = ITEMS.register("raw_mahi_mahi_meat", () -> new Item(new Item.Properties().food(RAW_MAHI_MAHI_MEAT_FOOD)));

    public static final RegistrySupplier<Item> SAUROPOD_MEAT = ITEMS.register("sauropod_meat", () -> new Item(new Item.Properties().food(SAUROPOD_MEAT_FOOD)));
    public static final RegistrySupplier<Item> RAW_SAUROPOD_MEAT = ITEMS.register("raw_sauropod_meat", () -> new Item(new Item.Properties().food(RAW_SAUROPOD_MEAT_FOOD)));

    public static final RegistrySupplier<Item> OX_HORN = ITEMS.register("ox_horn", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> FANG = ITEMS.register("fang", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CHITIN = ITEMS.register("chitin", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RHINO_HORN = ITEMS.register("rhino_horn", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> PUFFIN_BEAK = ITEMS.register("puffin_beak", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> RATTLE = ITEMS.register("rattle", () -> new Item(new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
