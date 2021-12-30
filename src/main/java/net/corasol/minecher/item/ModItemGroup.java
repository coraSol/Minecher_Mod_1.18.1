package net.corasol.minecher.item;

import net.corasol.minecher.Minecher;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MINECHER = FabricItemGroupBuilder.build(new Identifier(Minecher.MOD_ID, "minecher"),
            () -> new ItemStack(ModItems.SILVER_INGOT));
}