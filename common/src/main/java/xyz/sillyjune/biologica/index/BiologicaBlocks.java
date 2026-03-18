package xyz.sillyjune.biologica.index;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DeadBushBlock;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.block.CranberryBushBlock;
import xyz.sillyjune.biologica.block.OcotilloBlock;
import xyz.sillyjune.biologica.util.BiologicaWoodType;

import java.util.function.Function;
import java.util.function.Supplier;

public class BiologicaBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Biologica.MOD_ID, Registries.BLOCK);

    public static RegistrySupplier<Block> BOSTON_FERN = register("boston_fern", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BLOODROOT = register("bloodroot", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BLUE_BONNET = register("blue_bonnet", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> HELICONIA = register("heliconia", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> PEACE_LILY = register("peace_lily", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> FLAMINGO_FLOWER = register("flamingo_flower", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> LAVENDER = register("lavender", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> OCOTILLO = register("ocotillo", OcotilloBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> HORSETAILS = register("horsetails", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> DRACAENA = register("dracaena", TallFlowerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> ALOE_VERA = register("aloe_vera", DeadBushBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> RUBBER_PLANT = register("rubber_plant", TallFlowerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BEARGRASS = register("beargrass", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> CRANBERRY_BUSH = register("cranberry_bush", CranberryBushBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));

    public static RegistrySupplier<Block> SNAKE_PLANT = register("snake_plant", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> SPIDER_PLANT = register("spider_plant", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> CREEPING_FIG = register("creeping_fig", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> SESUVIUM = register("sesuvium", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> GLASSWORT = register("glasswort", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BARREL_CACTUS = register("barrel_cactus", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> PRICKLY_PEAR = register("prickly_pear", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));

    public static RegistrySupplier<Block> NIPA_PALM = register("nipa_palm", TallFlowerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> ELEPHANT_EAR = register("elephant_ear", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> YARROW = register("yarrow", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> YUCCA = register("yucca", TallFlowerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BRACKEN_FERNS = register("bracken_ferns", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> LAVA_CACTUS = register("lava_cactus", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> SALT_BUSH = register("salt_bush", TallFlowerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> BOG_ROSEMARY = register("bog_rosemary", TallGrassBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY));
    public static RegistrySupplier<Block> VOLCANIC_COBBLESTONE = register("volcanic_cobblestone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F));
    public static RegistrySupplier<Block> VOLCANIC_STONE = register("volcanic_stone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F));
    public static RegistrySupplier<Block> LIMESTONE = register("limestone", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F));
    public static RegistrySupplier<Block> LIMESTONE_GRAVEL = register("limestone_gravel", GravelBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL));

    public static BiologicaWoodType KOA_WOOD = new BiologicaWoodType("koa");
    public static BiologicaWoodType JACARANDA_WOOD = new BiologicaWoodType("jacaranda");
    public static BiologicaWoodType MESQUITE_WOOD = new BiologicaWoodType("mesquite");
    public static BiologicaWoodType TULANG_WOOD = new BiologicaWoodType("tulang");
    public static BiologicaWoodType DOUGLAS_FIR_WOOD = new BiologicaWoodType("douglasfir");
    public static BiologicaWoodType OHIA_LEHUA_WOOD = new BiologicaWoodType("ohialehua");

    static void register() {
        BLOCKS.register();
    }

    public static <T extends Block> RegistrySupplier<T> register(String id, Function<BlockBehaviour.Properties, T> factory, Supplier<BlockBehaviour.Properties> properties) {
        return BLOCKS.register(id, () -> factory.apply(properties.get()));
    }

    public static <T extends Block> RegistrySupplier<T> register(String id, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties properties) {
        return register(id, factory, () -> properties);
    }

    public static <T extends Block> RegistrySupplier<T> register(String id, Supplier<T> factory) {
        return BLOCKS.register(id, factory);
    }

    public static RegistrySupplier<Block> register(String id, BlockBehaviour.Properties properties) {
        return register(id, Block::new, properties);
    }
}
