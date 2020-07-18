package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class WizardingCauldron extends CustomModelBlock {
    public enum CauldronType {
        BASIC, COPPER, BRASS, BRONZE, SILVER, GOLD, PEWTER
    }
    private CauldronType mCauldronType;
    public boolean isFilled;

    public WizardingCauldron (Properties properties, CauldronType cauldronType, boolean filled){
        super(properties, "basic_cauldron");
        mCauldronType = cauldronType;
        isFilled = filled;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            return ActionResultType.SUCCESS;
        }
        if (isFilled){
            if (!player.getHeldItem(handIn).isEmpty()){
                return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
            }
            switch (mCauldronType){
                case BASIC:
                    worldIn.setBlockState(pos, ModBlocks.BASIC_CAULDRON.get().getDefaultState());
                    break;
                case BRASS:
                    worldIn.setBlockState(pos, ModBlocks.BRASS_CAULDRON.get().getDefaultState());
                    break;
                case BRONZE:
                    worldIn.setBlockState(pos, ModBlocks.BRONZE_CAULDRON.get().getDefaultState());
                    break;
                case COPPER:
                    worldIn.setBlockState(pos, ModBlocks.COPPER_CAULDRON.get().getDefaultState());
                    break;
                case GOLD:
                    worldIn.setBlockState(pos, ModBlocks.GOLD_CAULDRON.get().getDefaultState());
                    break;
                case PEWTER:
                    worldIn.setBlockState(pos, ModBlocks.PEWTER_CAULDRON.get().getDefaultState());
                    break;
                case SILVER:
                    worldIn.setBlockState(pos, ModBlocks.SILVER_CAULDRON.get().getDefaultState());
                    break;
            }
            return ActionResultType.SUCCESS;
        }
        if (player.getHeldItem(handIn).getItem() != Items.WATER_BUCKET){
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
        switch (mCauldronType){
            case BASIC:
                worldIn.setBlockState(pos, ModBlocks.BASIC_CAULDRON_FILLED.get().getDefaultState());
                break;
            case BRASS:
                worldIn.setBlockState(pos, ModBlocks.BRASS_CAULDRON_FILLED.get().getDefaultState());
                break;
            case BRONZE:
                worldIn.setBlockState(pos, ModBlocks.BRONZE_CAULDRON_FILLED.get().getDefaultState());
                break;
            case COPPER:
                worldIn.setBlockState(pos, ModBlocks.COPPER_CAULDRON_FILLED.get().getDefaultState());
                break;
            case GOLD:
                worldIn.setBlockState(pos, ModBlocks.GOLD_CAULDRON_FILLED.get().getDefaultState());
                break;
            case PEWTER:
                worldIn.setBlockState(pos, ModBlocks.PEWTER_CAULDRON_FILLED.get().getDefaultState());
                break;
            case SILVER:
                worldIn.setBlockState(pos, ModBlocks.SILVER_CAULDRON_FILLED.get().getDefaultState());
                break;
        }
        return ActionResultType.SUCCESS;

    }
}
