package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister <Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MagnificentMagicalMod.MOD_ID);
    public static final RegistryObject<Block> PEWTER_BLOCK=BLOCKS.register("pewter_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_BLOCK=BLOCKS.register("silver_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_BLOCK=BLOCKS.register("copper_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BRONZE_BLOCK=BLOCKS.register("bronze_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BRASS_BLOCK=BLOCKS.register("brass_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_ORE=BLOCKS.register("copper_ore",()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_ORE=BLOCKS.register("silver_ore",()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f,6f).harvestLevel(2).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> BASIC_CAULDRON=BLOCKS.register("basic_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BASIC, false));
    public static final RegistryObject<Block> BASIC_CAULDRON_FILLED=BLOCKS.register("basic_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BASIC, true));
    public static final RegistryObject<Block> COPPER_CAULDRON=BLOCKS.register("copper_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.COPPER, false));
    public static final RegistryObject<Block> COPPER_CAULDRON_FILLED=BLOCKS.register("copper_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.COPPER, true));
    public static final RegistryObject<Block> BRASS_CAULDRON=BLOCKS.register("brass_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BRASS, false));
    public static final RegistryObject<Block> BRASS_CAULDRON_FILLED=BLOCKS.register("brass_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BRASS, true));
    public static final RegistryObject<Block> SILVER_CAULDRON=BLOCKS.register("silver_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.SILVER, false));
    public static final RegistryObject<Block> SILVER_CAULDRON_FILLED=BLOCKS.register("silver_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.SILVER, true));
    public static final RegistryObject<Block> BRONZE_CAULDRON=BLOCKS.register("bronze_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BRONZE, false));
    public static final RegistryObject<Block> BRONZE_CAULDRON_FILLED=BLOCKS.register("bronze_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.BRONZE, true));
    public static final RegistryObject<Block> PEWTER_CAULDRON=BLOCKS.register("pewter_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.PEWTER, false));
    public static final RegistryObject<Block> PEWTER_CAULDRON_FILLED=BLOCKS.register("pewter_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.PEWTER, true));
    public static final RegistryObject<Block> GOLD_CAULDRON=BLOCKS.register("gold_cauldron",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.GOLD, false));
    public static final RegistryObject<Block> GOLD_CAULDRON_FILLED=BLOCKS.register("gold_cauldron_filled",()-> new WizardingCauldron(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE), WizardingCauldron.CauldronType.GOLD, true));




    public static final RegistryObject<Block> BURNER=BLOCKS.register("burner",()->new WizardingBurner(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f,6f), false));




}
