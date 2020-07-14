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

//block item registry
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", ()->new BlockItem(ModBlocks.SILVER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).addToolType(ToolType.PICKAXE, 1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> PEWTER_BLOCK = ITEMS.register("pewter_block", ()->new BlockItem(ModBlocks.PEWTER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).addToolType(ToolType.PICKAXE, 1).group(tabMagnificentMagicalMod)));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", ()->new BlockItem(ModBlocks.COPPER_BLOCK.get(), (new Item.Properties()).maxStackSize(64).addToolType(ToolType.PICKAXE, 1).group(tabMagnificentMagicalMod)));

}
