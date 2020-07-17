package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class WizardingCauldron extends Block {

    public static final VoxelShape CAULDRON_SHAPE = VoxelShapes.create(3,0,13,13,10,13);
    public WizardingCauldron(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return CAULDRON_SHAPE;
    }
//    @Override
//    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
//        return CAULDRON_SHAPE;
//    }
}
