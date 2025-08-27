package xyz.sillyjune.biologica.Util;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static xyz.sillyjune.biologica.Biologica.MOD_ID;
import static xyz.sillyjune.biologica.Blocks.BOSTON_FERN;
import static xyz.sillyjune.biologica.Blocks.VOLCANIC_STONE;
import static xyz.sillyjune.biologica.Items.*;

public class Tabs {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> FOOD_TAB = TABS.register("food", () -> CreativeTabRegistry.create(Component.translatable("category.biologica.food"), () -> new ItemStack(MAMMOTH_MEAT.get())));
    public static final RegistrySupplier<CreativeModeTab> CRAFTING_TAB = TABS.register("crafting", () -> CreativeTabRegistry.create(Component.translatable("category.biologica.crafting"), () -> new ItemStack(OX_HORN.get())));
    public static final RegistrySupplier<CreativeModeTab> TOOLS_TAB = TABS.register("tools", () -> CreativeTabRegistry.create(Component.translatable("category.biologica.tools"), () -> new ItemStack(MARACAS.get())));
    public static final RegistrySupplier<CreativeModeTab> BLOCKS_TAB = TABS.register("blocks", () -> CreativeTabRegistry.create(Component.translatable("category.biologica.blocks"), () -> new ItemStack(VOLCANIC_STONE.get())));
    public static final RegistrySupplier<CreativeModeTab> NATURE_TAB = TABS.register("nature", () -> CreativeTabRegistry.create(Component.translatable("category.biologica.natural"), () -> new ItemStack(BOSTON_FERN.get())));

    public static void register(){
        TABS.register();
    }
}
