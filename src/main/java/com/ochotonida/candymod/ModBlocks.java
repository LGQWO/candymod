package com.ochotonida.candymod;

import com.ochotonida.candymod.block.candycane.*;
import com.ochotonida.candymod.block.candysoil.*;
import com.ochotonida.candymod.block.chocolate.*;
import com.ochotonida.candymod.block.cottoncandy.*;
import com.ochotonida.candymod.block.gummy.*;
import com.ochotonida.candymod.block.various.*;
import com.ochotonida.candymod.enums.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    // Blocks
    public static final BlockChocolateSapling CHOCOLATE_SAPLING = new BlockChocolateSapling();
    public static final BlockCookieOre COOKIE_ORE = new BlockCookieOre();
    public static final BlockCottonCandyLeaves COTTON_CANDY_LEAVES = new BlockCottonCandyLeaves();
    public static final BlockCottonCandyPlant COTTON_CANDY_PLANT = new BlockCottonCandyPlant();
    public static final BlockCottonCandySapling COTTON_CANDY_SAPLING = new BlockCottonCandySapling();
    public static final BlockCottonCandyGrass COTTON_CANDY_GRASS = new BlockCottonCandyGrass();
    public static final BlockSugar SUGAR_BLOCK = new BlockSugar();
    public static final BlockSugarSand SUGAR_SAND = new BlockSugarSand();
    public static final BlockWaferStick WAFER_STICK = new BlockWaferStick();

    // Blocks with subtypes
    public static final BlockCandyCane CANDY_CANE = new BlockCandyCane();
    public static final BlockCandyGrass CANDY_GRASS = new BlockCandyGrass();
    public static final BlockCandySoil CANDY_SOIL = new BlockCandySoil();
    public static final BlockChocolateBar CHOCOLATE_BAR = new BlockChocolateBar();
    public static final BlockChocolateLeaves CHOCOLATE_LEAVES = new BlockChocolateLeaves();
    public static final BlockChocolateMushroom CHOCOLATE_MUSHROOM = new BlockChocolateMushroom();
    public static final BlockChocolate CHOCOLATE_BLOCK = new BlockChocolate(Material.ROCK, "chocolate_block");
    public static final BlockChocolate CHOCOLATE_BRICK = new BlockChocolate(Material.ROCK, "chocolate_brick_block");
    public static final BlockGummy GUMMY_BLOCK = new BlockGummy();
    public static final BlockGummySolid HARDENED_GUMMY_BLOCK = new BlockGummySolid();
    public static final BlockGummyWorm GUMMY_WORM_BLOCK = new BlockGummyWorm();

    // ItemBlocks for blocks with subtypes
    public static final ItemBlockCandyCane CANDY_CANE_IB = new ItemBlockCandyCane();
    public static final ItemBlockCandyGrass CANDY_GRASS_IB = new ItemBlockCandyGrass();
    public static final ItemBlockCandySoil CANDY_SOIL_IB = new ItemBlockCandySoil();
    public static final ItemBlockChocolateLeaves CHOCOLATE_LEAVES_IB = new ItemBlockChocolateLeaves();
    public static final ItemBlockChocolateMushroom CHOCOLATE_MUSHROOM_IB = new ItemBlockChocolateMushroom();
    public static final ItemBlockChocolate CHOCOLATE_BLOCK_IB = new ItemBlockChocolate(CHOCOLATE_BLOCK);
    public static final ItemBlockChocolate CHOCOLATE_BRICK_IB = new ItemBlockChocolate(CHOCOLATE_BRICK);
    public static final ItemBlockGummy GUMMY_BLOCK_IB = new ItemBlockGummy(GUMMY_BLOCK);
    public static final ItemBlockGummy HARDENED_GUMMY_IB = new ItemBlockGummy(HARDENED_GUMMY_BLOCK);
    public static final ItemBlockGummy GUMMY_WORM_IB = new ItemBlockGummy(GUMMY_WORM_BLOCK);

    /**
     * Registers all Blocks
     */
    static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                CANDY_CANE,
                CANDY_GRASS,
                CANDY_SOIL,
                COOKIE_ORE,
                COTTON_CANDY_LEAVES,
                COTTON_CANDY_PLANT,
                COTTON_CANDY_SAPLING,
                COTTON_CANDY_GRASS,
                CHOCOLATE_BAR,
                CHOCOLATE_LEAVES,
                CHOCOLATE_MUSHROOM,
                CHOCOLATE_SAPLING,
                CHOCOLATE_BLOCK,
                CHOCOLATE_BRICK,
                SUGAR_BLOCK,
                SUGAR_SAND,
                WAFER_STICK,
                GUMMY_BLOCK,
                HARDENED_GUMMY_BLOCK,
                GUMMY_WORM_BLOCK
        );
    }

    /**
     * Registers all ItemBlocks
     */
    static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                COOKIE_ORE.createItemBlock(),
                COTTON_CANDY_LEAVES.createItemBlock(),
                COTTON_CANDY_PLANT.createItemBlock(),
                COTTON_CANDY_SAPLING.createItemBlock(),
                COTTON_CANDY_GRASS.createItemBlock(),
                CHOCOLATE_SAPLING.createItemBlock(),
                SUGAR_BLOCK.createItemBlock(),
                WAFER_STICK.createItemBlock(),
                SUGAR_SAND.createItemBlock(),
                CANDY_GRASS_IB,
                CANDY_CANE_IB,
                CANDY_SOIL_IB,
                CHOCOLATE_LEAVES_IB,
                CHOCOLATE_MUSHROOM_IB,
                CHOCOLATE_BLOCK_IB,
                CHOCOLATE_BRICK_IB,
                GUMMY_BLOCK_IB,
                HARDENED_GUMMY_IB,
                GUMMY_WORM_IB
        );
    }

    /**
     * Helper for registering a Block without subtypes
     */
    private static void registerModel(Block block, String name) {
        CandyMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, name);
    }

    /**
     * Register all ItemBlock models
     */
    static void registerModels() {
        registerModel(COOKIE_ORE, "cookie_ore_block");
        registerModel(COTTON_CANDY_PLANT, "cotton_candy_plant_block");
        registerModel(COTTON_CANDY_LEAVES, "cotton_candy_leaves_block");
        registerModel(COTTON_CANDY_SAPLING, "cotton_candy_sapling_block");
        registerModel(COTTON_CANDY_GRASS, "cotton_candy_grass_block");
        registerModel(CHOCOLATE_SAPLING, "chocolate_sapling_block");
        registerModel(SUGAR_BLOCK, "sugar_block");
        registerModel(SUGAR_SAND, "sugar_sand_block");
        registerModel(WAFER_STICK, "wafer_stick_block");

        ModelResourceLocation itemMRL;

        // Candy Cane based blocks
        for (EnumCandyCane enumcandycane : EnumCandyCane.values()) {
            itemMRL = new ModelResourceLocation("candymod:candy_cane_block_" + enumcandycane.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CANDY_CANE_IB, enumcandycane.getMetadata(), itemMRL);
        }

        // Chocolate based blocks
        for (EnumChocolate enumchocolate : EnumChocolate.values()) {
            itemMRL = new ModelResourceLocation("candymod:candy_soil_block_" + enumchocolate.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CANDY_SOIL_IB, enumchocolate.getMetadata(), itemMRL);

            itemMRL = new ModelResourceLocation("candymod:chocolate_leaves_block_" + enumchocolate.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CHOCOLATE_LEAVES_IB, enumchocolate.getMetadata(), itemMRL);

            itemMRL = new ModelResourceLocation("candymod:chocolate_mushroom_block_" + enumchocolate.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CHOCOLATE_MUSHROOM_IB, enumchocolate.getMetadata(), itemMRL);

            itemMRL = new ModelResourceLocation("candymod:chocolate_block_" + enumchocolate.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CHOCOLATE_BLOCK_IB, enumchocolate.getMetadata(), itemMRL);

            itemMRL = new ModelResourceLocation("candymod:chocolate_brick_block_" + enumchocolate.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(CHOCOLATE_BRICK_IB, enumchocolate.getMetadata(), itemMRL);

            // TODO implement dark candy grass
            if (enumchocolate != EnumChocolate.DARK) {
                itemMRL = new ModelResourceLocation("candymod:candy_grass_block_" + enumchocolate.getName(), "inventory");
                ModelLoader.setCustomModelResourceLocation(CANDY_GRASS_IB, enumchocolate.getMetadata(), itemMRL);
            }
        }

        // Gummy based blocks
        for (EnumGummy enumgummy : EnumGummy.values()) {
            itemMRL = new ModelResourceLocation("candymod:gummy_block", "inventory");
            ModelLoader.setCustomModelResourceLocation(GUMMY_BLOCK_IB, enumgummy.getMetadata(), itemMRL);
            itemMRL = new ModelResourceLocation("candymod:hardened_gummy_block", "inventory");
            ModelLoader.setCustomModelResourceLocation(HARDENED_GUMMY_IB, enumgummy.getMetadata(), itemMRL);
            itemMRL = new ModelResourceLocation("candymod:gummy_worm_block", "inventory");
            ModelLoader.setCustomModelResourceLocation(GUMMY_WORM_IB, enumgummy.getMetadata(), itemMRL);
        }
    }
}