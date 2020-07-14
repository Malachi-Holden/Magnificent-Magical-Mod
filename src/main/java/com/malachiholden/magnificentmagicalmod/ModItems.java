package com.malachiholden.magnificentmagicalmod;

import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {

    static final ItemGroup tabMagnificentMagicalMod = new ItemGroup("tabMagnificentMagicalMod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(SILVER_BLOCK.get());
        }
    };


    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagnificentMagicalMod.MOD_ID);

//item registry

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()->new Item(new Item.Properties().maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()->new Item(new Item.Properties().maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> PEWTER_INGOT = ITEMS.register("pewter_ingot", ()->new Item(new Item.Properties().maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ()->new Item(new Item.Properties().maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", ()->new Item(new Item.Properties().maxStackSize(64).group(tabMagnificentMagicalMod)));



//block item registry
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", ()->new BlockItem(ModBlocks.SILVER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> PEWTER_BLOCK = ITEMS.register("pewter_block", ()->new BlockItem(ModBlocks.PEWTER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", ()->new BlockItem(ModBlocks.COPPER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRONZE_BLOCK = ITEMS.register("bronze_block", ()->new BlockItem(ModBlocks.BRONZE_BLOCK.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRASS_BLOCK = ITEMS.register("brass_block", ()->new BlockItem(ModBlocks.BRASS_BLOCK.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", ()->new BlockItem(ModBlocks.COPPER_ORE.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", ()->new BlockItem(ModBlocks.SILVER_ORE.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));

}
