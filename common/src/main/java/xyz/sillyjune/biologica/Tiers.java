package xyz.sillyjune.biologica;

import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.OBSIDIAN;
import static xyz.sillyjune.biologica.Items.CLAW;

public enum Tiers implements Tier {
    MACUHALUTI_TIER(0, 550, 0.5F, 5.0F, 2, () -> Ingredient.of(OBSIDIAN)),
    CLAW_TIER(0, 550, 0.5F, 5.0F, 2, () -> Ingredient.of(CLAW.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private Tiers(int j, int k, float f, float g, int l, Supplier<Ingredient> supplier) {
        this.level = j;
        this.uses = k;
        this.speed = f;
        this.damage = g;
        this.enchantmentValue = l;
        this.repairIngredient = new LazyLoadedValue(supplier);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
