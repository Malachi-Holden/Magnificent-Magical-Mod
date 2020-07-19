package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class WizardingBurner extends CustomModelBlock{

    public boolean isBurning;

    public WizardingBurner(Properties properties, boolean burning) {
        super(properties, "burner");
        isBurning = burning;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote){
            return ActionResultType.SUCCESS;
        }
        if (isBurning){
            if (player.getHeldItem(handIn).getItem() != Items.WATER_BUCKET){
                return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
            }
            worldIn.setBlockState(pos, ModBlocks.BURNER.get().getDefaultState());
        }
        else {
            if (player.getHeldItem(handIn).getItem() != Items.FLINT_AND_STEEL){
                return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
            }
            worldIn.setBlockState(pos, ModBlocks.BURNER_LIT.get().getDefaultState());
        }

        return ActionResultType.SUCCESS;
    }
}
