package net.corasol.minecher.item;

import net.corasol.minecher.Minecher;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MINECHER)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings().group(ModItemGroup.MINECHER)));
    public static final Item HANDLE = registerItem("handle", new Item(new FabricItemSettings().group(ModItemGroup.MINECHER)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(Minecher.MOD_ID, name), item);
    }

    public static void  registerModItems()
    {
        System.out.println("Registering Mod Items for " + Minecher.MOD_ID);
    }
}