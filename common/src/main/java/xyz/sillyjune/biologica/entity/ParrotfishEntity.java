package xyz.sillyjune.biologica.entity;

import com.mojang.serialization.Codec;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.VariantHolder;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class ParrotfishEntity extends AbstractSchoolingFish implements VariantHolder<ParrotfishEntity.Variant> {
    public static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(ParrotfishEntity.class, EntityDataSerializers.INT);

    public ParrotfishEntity(EntityType<ParrotfishEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public @Nullable SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData spawnData, @Nullable CompoundTag dataTag) {
        this.setVariant(Variant.getRandom(random));
        return super.finalizeSpawn(level, difficulty, reason, spawnData, dataTag);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putString("variant", this.getVariant().getId());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setVariant(Variant.byId(tag.getString("variant")));
    }

    @Override
    public void setVariant(Variant variant) {
        this.entityData.set(VARIANT, variant.getNetworkId());
    }

    @Override
    public Variant getVariant() {
        return Variant.byNetworkId(this.entityData.get(VARIANT));
    }

    @Override
    public int getMaxSchoolSize() {
        return 5;
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(Items.SALMON_BUCKET);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.SALMON_FLOP;
    }

    public enum Variant implements StringRepresentable {
        BLUNTHEAD(0, "blunthead"),
        EMBER(1, "ember"),
        GREENBELLY(2, "greenbelly"),
        HUMPHEAD(3, "humphead"),
        QUEEN(4, "queen"),
        RUSTY(5, "rusty");

        private static final IntFunction<Variant> BY_NETWORK_ID = ByIdMap.continuous(Variant::getNetworkId, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
        private static final Map<String, Variant> BY_ID = Arrays.stream(values()).collect(Collectors.toMap(Variant::getId, Function.identity()));
        public static final Codec<Variant> CODEC = StringRepresentable.fromEnum(Variant::values);

        private final int networkId;
        private final String id;

        Variant(int networkId, String id) {
            this.networkId = networkId;
            this.id = id;
        }

        public static Variant byNetworkId(int networkId) {
            return BY_NETWORK_ID.apply(networkId);
        }

        public static Variant byId(String id) {
            return BY_ID.getOrDefault(id, Variant.BLUNTHEAD);
        }

        public static Variant getRandom(RandomSource random) {
            Variant[] values = values();
            return values[random.nextInt(values.length)];
        }

        public int getNetworkId() {
            return this.networkId;
        }

        public String getId() {
            return this.id;
        }

        @Override
        public String getSerializedName() {
            return this.id;
        }
    }
}
