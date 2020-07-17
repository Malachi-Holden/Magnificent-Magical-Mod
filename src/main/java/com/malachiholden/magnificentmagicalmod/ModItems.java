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
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", ()->new BlockItem(ModBlocks.SILVER_ORE.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", ()->new BlockItem(ModBlocks.COPPER_ORE.get(), (new Item.Properties()).maxStackSize(64).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BASIC_CAULDRON = ITEMS.register("basic_cauldron", ()->new BlockItem(ModBlocks.BASIC_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_CAULDRON = ITEMS.register("copper_cauldron", ()->new BlockItem(ModBlocks.COPPER_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRASS_CAULDRON = ITEMS.register("brass_cauldron", ()->new BlockItem(ModBlocks.BRASS_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> PEWTER_CAULDRON = ITEMS.register("pewter_cauldron", ()->new BlockItem(ModBlocks.PEWTER_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BRONZE_CAULDRON = ITEMS.register("bronze_cauldron", ()->new BlockItem(ModBlocks.BRONZE_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> SILVER_CAULDRON = ITEMS.register("silver_cauldron", ()->new BlockItem(ModBlocks.SILVER_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> GOLD_CAULDRON = ITEMS.register("gold_cauldron", ()->new BlockItem(ModBlocks.GOLD_CAULDRON.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> BURNER = ITEMS.register("burner", ()->new BlockItem(ModBlocks.BURNER.get(), (new Item.Properties()).maxStackSize(1).group(tabMagnificentMagicalMod)));
}
