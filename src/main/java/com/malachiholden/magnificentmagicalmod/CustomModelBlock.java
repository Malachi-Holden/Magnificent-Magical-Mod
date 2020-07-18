package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CustomModelBlock extends Block {

    public VoxelShape SHAPE;
    public CustomModelBlock(Properties properties, String modelName) {
        super(properties);
        SHAPE = VoxelShapeModel.fromModelName(modelName);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
