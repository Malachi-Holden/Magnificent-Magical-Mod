package com.malachiholden.magnificentmagicalmod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagnificentMagicalMod.MOD_ID);
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", ()->new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_BLOCK = ITEMS.register("pewter_block", ()->new BlockItem(ModBlocks.PEWTER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", ()->new BlockItem(ModBlocks.COPPER_BLOCK.get(), new Item.Properties()));
}
