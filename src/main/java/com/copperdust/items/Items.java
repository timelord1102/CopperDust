package com.copperdust.items;

import com.copperdust.CopperDustMain;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static Item copperDust = registerItem("copperdust", new Item(new Item.Settings()));

    private static void addItemsToRedStoneItemGroup(FabricItemGroupEntries entries) {
        entries.add(copperDust);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CopperDustMain.MOD_ID, name), item);
    }

    public static void registerItems() {
        CopperDustMain.LOGGER.info("Registering Items for " + CopperDustMain.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(Items::addItemsToRedStoneItemGroup);
    }

}