package net.corasol.minecher.block;

import net.corasol.minecher.Minecher;
import net.corasol.minecher.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));
    public static final Block BLOCK_OF_SILVER = registerBlock("block_of_silver",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Minecher.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Minecher.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.MINECHER)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + Minecher.MOD_ID);
    }

}
