package xyz.sillyjune.biologica;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;

public class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> OX_HORN = ITEMS.register("ox_horn", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> FANG = ITEMS.register("fang", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CHITIN = ITEMS.register("chitin", () -> new Item(new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
