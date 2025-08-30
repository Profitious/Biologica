package xyz.sillyjune.biologica.Util;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static xyz.sillyjune.biologica.Blocks.BLOCKS;
import static xyz.sillyjune.biologica.Items.ITEMS;
import static xyz.sillyjune.biologica.Util.Tabs.BLOCKS_TAB;

public class WoodType {
    public static RegistrySupplier<Block> PLANK;
    public static RegistrySupplier<Item> PLANK_ITEM;

    public static RegistrySupplier<Block> LOG;
    public static RegistrySupplier<Item> LOG_ITEM;

    public static RegistrySupplier<Block> STRIPPED_LOG;
    public static RegistrySupplier<Item> STRIPPED_LOG_ITEM;

    public static RegistrySupplier<Block> LEAVES;
    public static RegistrySupplier<Item> LEAVES_ITEM;

    private final String identifier;
    public WoodType(String id) {
        identifier = id;
        LOG = BLOCKS.register(identifier+"_log", WoodType::newLog);
        LOG_ITEM = ITEMS.register(identifier, () -> new BlockItem(LOG.get(), new Item.Properties().arch$tab(BLOCKS_TAB)));
    }
    private static RotatedPillarBlock newLog() {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PODZOL : MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }

    // "Mom, can we [use datagen]"
    // "No honey, we have datagen at home"
    // Datagen at home:
    // This code is bad but it doesn't really matter - It just saves me writing fabric and forge specific datagen code for this, or manually creating the json
    public void create_json() {
        new File("generated/assets/biologica/blockstates").mkdirs();
        new File("generated/assets/biologica/models").mkdirs();
        new File("generated/assets/biologica/models/block").mkdirs();
        new File("generated/assets/biologica/models/item").mkdirs();
        new File("generated/assets/biologica/textures").mkdirs();
        new File("generated/data/biologica/recipes").mkdirs();

        /*

        BLOCK/ITEM MODELS AND BLOCKSTATES

         */
        try {
            File f = new File("generated/assets/biologica/blockstates/" + identifier + "_log.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/blockstates/" + identifier + "_log.json");
            w.write(""" 
                    {
                      "variants": {
                        "": {
                          "model": "biologica:block/"""+ identifier + "_log\"" + """ 
                        }
                      }
                    }
                    """);
            w.close();

        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/block/" + identifier + "_log.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/block/" + identifier + "_log.json");
            w.write(""" 
                    {
                      "parent": "block/cube_all",
                      "textures": {
                        "all": "biologica:block/""" + identifier + "_log.json\"" + """
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/items/" + identifier + "_log.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/items/" + identifier + "_log.json");
            w.write(""" 
                        {
                          "model": {
                            "type": "minecraft:model",
                            "model": "biologica:block/""" + identifier + "_log.json\"" + """
                          }
                        }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/item/" + identifier + "_log.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/item/" + identifier + "_log.json");
            w.write(""" 
                    {
                      "parent": "biologica:block/""" + identifier + "_log.json\"" + """
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/blockstates/" + identifier + "_planks.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/blockstates/" + identifier + "_planks.json");
            w.write(""" 
                    {
                      "variants": {
                        "": {
                          "model": "biologica:block/"""+ identifier + "_planks\"" + """ 
                        }
                      }
                    }
                    """);
            w.close();

        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/block/" + identifier + "_planks.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/block/" + identifier + "_planks.json");
            w.write(""" 
                    {
                      "parent": "block/cube_all",
                      "textures": {
                        "all": "biologica:block/""" + identifier + "_planks.json\"" + """
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/items/" + identifier + "_planks.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/items/" + identifier + "_planks.json");
            w.write(""" 
                        {
                          "model": {
                            "type": "minecraft:model",
                            "model": "biologica:block/""" + identifier + "_planks.json\"" + """
                          }
                        }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/item/" + identifier + "_planks.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/item/" + identifier + "_planks.json");
            w.write(""" 
                    {
                      "parent": "biologica:block/""" + identifier + "_planks.json\"" + """
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/blockstates/" + identifier + "_leaves.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/blockstates/" + identifier + "_leaves.json");
            w.write(""" 
                    {
                      "variants": {
                        "": {
                          "model": "biologica:block/"""+ identifier + "_leaves\"" + """ 
                        }
                      }
                    }
                    """);
            w.close();

        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/block/" + identifier + "_leaves.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/block/" + identifier + "_leaves.json");
            w.write(""" 
                    {
                      "parent": "block/cube_all",
                      "textures": {
                        "all": "biologica:block/""" + identifier + "_leaves.json\"" + """
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/items/" + identifier + "_leaves.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/items/" + identifier + "_leaves.json");
            w.write(""" 
                        {
                          "model": {
                            "type": "minecraft:model",
                            "model": "biologica:block/""" + identifier + "_leaves.json\"" + """
                          }
                        }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/item/" + identifier + "_leaves.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/item/" + identifier + "_leaves.json");
            w.write(""" 
                    {
                      "parent": "biologica:block/""" + identifier + "_leaves.json\"" + """
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/blockstates/" + identifier + "_log_stripped.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/blockstates/" + identifier + "_log_stripped.json");
            w.write(""" 
                    {
                      "variants": {
                        "": {
                          "model": "biologica:block/"""+ identifier + "_log_stripped\"" + """ 
                        }
                      }
                    }
                    """);
            w.close();

        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/block/" + identifier + "_log_stripped.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/block/" + identifier + "_log_stripped.json");
            w.write(""" 
                    {
                      "parent": "block/cube_all",
                      "textures": {
                        "all": "biologica:block/""" + identifier + "_log_stripped.json\"" + """
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/items/" + identifier + "_log_stripped.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/items/" + identifier + "_log_stripped.json");
            w.write(""" 
                        {
                          "model": {
                            "type": "minecraft:model",
                            "model": "biologica:block/""" + identifier + "_log_stripped.json\"" + """
                          }
                        }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/assets/biologica/models/item/" + identifier + "_log_stripped.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/assets/biologica/models/item/" + identifier + "_log_stripped.json");
            w.write(""" 
                    {
                      "parent": "biologica:block/""" + identifier + "_log_stripped.json\"" + """
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};

        /*

        RECIPES

         */
        try {
            File f = new File("generated/data/biologica/recipes/" + identifier + "_log.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/data/biologica/recipes/" + identifier + "_log.json");
            w.write(""" 
                    {
                      "type": "minecraft:crafting_shapeless",
                      "category": "building",
                      "group": "planks",
                      "ingredients": [
                        {
                          "tag": "biologica:""" + identifier + "_log\"" + """
                        
                        }
                      ],
                      "result": {
                        "count": 4,
                        "item": "biologica:""" + identifier + "_planks\"" + """ 
                      
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};
        try {
            File f = new File("generated/data/biologica/recipes/" + identifier + "_log_stripped.json");
            f.createNewFile();
            FileWriter w = new FileWriter("generated/data/biologica/recipes/" + identifier + "_log_stripped.json");
            w.write(""" 
                    {
                      "type": "minecraft:crafting_shapeless",
                      "category": "building",
                      "group": "planks",
                      "ingredients": [
                        {
                          "tag": "biologica:""" + identifier + "_log\"" + """
                        
                        }
                      ],
                      "result": {
                        "count": 4,
                        "item": "biologica:""" + identifier + "_planks\"" + """ 
                      
                      }
                    }
                    """);
            w.close();
        } catch (IOException ignored) {};

        /*

        LOOT TABLES

         */
    }

    public Block plank() { return PLANK.get(); }
    public Item plankItem() { return PLANK_ITEM.get(); }
    public Block log() { return LOG.get(); }
    public Item logItem() { return LOG_ITEM.get(); }
    public Block logStripped() { return STRIPPED_LOG.get(); }
    public Item logStrippedItem() { return STRIPPED_LOG_ITEM.get(); }
    public Block leaves() { return LEAVES.get(); }
    public Item leavesItem() { return LEAVES_ITEM.get(); }
}

