package net.corasol.minecher.util;

import net.corasol.minecher.Minecher;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final Tag<Block> VALUABLE_BLOCKS = createTag("valuable_blocks");

        public static final Tag.Identified<Block> SILVER_BLOCKS = createCommonTag("silver_blocks");
        public static final Tag.Identified<Block> SILVER_ORES = createCommonTag("silver_ores");

        private static Tag.Identified<Block> createTag(String name){
            return TagFactory.BLOCK.create(new Identifier(Minecher.MOD_ID, name));
        }
        private static Tag.Identified<Block> createCommonTag(String name){
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items{
        public static final Tag.Identified<Item> SILVER_INGOTS = createCommonTag("silver_ingots");
        public static final Tag.Identified<Item> SILVER_NUGGETS = createCommonTag("silver_nuggets");

        private static Tag.Identified<Item> createTag(String name){
            return TagFactory.ITEM.create(new Identifier(Minecher.MOD_ID, name));
        }
        private static Tag.Identified<Item> createCommonTag(String name){
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}