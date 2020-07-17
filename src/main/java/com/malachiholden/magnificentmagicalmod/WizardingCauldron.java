package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class WizardingCauldron extends Block {

    public static final VoxelShape CAULDRON_SHAPE = VoxelShapeModel.fromModelJson("C:\\Users\\The Holdens\\IdeaProjects\\Magnificent-Magical-Mod\\src\\main\\resources\\assets\\magnificentmagicalmod\\modelscopper_cauldron.json");
    public WizardingCauldron(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return CAULDRON_SHAPE;
    }
}
