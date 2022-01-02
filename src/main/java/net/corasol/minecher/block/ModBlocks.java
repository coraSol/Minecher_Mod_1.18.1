package net.corasol.minecher.block;

import net.corasol.minecher.Minecher;
import net.corasol.minecher.block.custom.ModButtonBlock;
import net.corasol.minecher.block.custom.ModPressurePlateBlock;
import net.corasol.minecher.block.custom.ModStairsBlock;
import net.corasol.minecher.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.MINECHER);
    public static final Block BLOCK_OF_SILVER = registerBlock("block_of_silver",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.MINECHER);
    public static final Block SILVER_SLAB = registerBlock("silver_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroups.MINECHER);
    public static final Block SILVER_STAIRS = registerBlock("silver_stairs",
            new ModStairsBlock(ModBlocks.BLOCK_OF_SILVER.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroups.MINECHER);
    public static final Block SILVER_BUTTON = registerBlock("silver_button",
            new ModButtonBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroups.MINECHER);
    public static final Block SILVER_PRESSURE_PLATE = registerBlock("silver_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroups.MINECHER);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Minecher.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Minecher.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroups.MINECHER)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + Minecher.MOD_ID);
    }

}