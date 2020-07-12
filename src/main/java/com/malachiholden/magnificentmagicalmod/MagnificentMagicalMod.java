package com.malachiholden.magnificentmagicalmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MagnificentMagicalMod.MOD_ID)
public class MagnificentMagicalMod {
    public static final String MOD_ID = "magnificentmagicalmod";

    public MagnificentMagicalMod(){
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
