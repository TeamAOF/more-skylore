package com.alloffabric.moreskylore.block.botania;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.lib.MSConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class AquaforaBlockEntity extends FluidPlacingFlowerBlockEntity {
    protected final int COST = MSConfig.get().aquaforaManaCost;
    protected final int MAX_MANA = COST * 2;
    protected final int RANGE = MSConfig.get().aquaforaRange;

    public AquaforaBlockEntity(BlockPos pos, BlockState state) {
        super(MSBlockEntities.AQUAFORA, pos, state);
    }

    @Override
    public int getRange() {
        return RANGE;
    }

    @Override
    public int getCost() {
        return COST;
    }

    @Override
    public Block getFluidBlock() {
        return Blocks.WATER;
    }

    @Override
    public int getMaxMana() {
        return MAX_MANA;
    }

    @Override
    public int getColor() {
        return 0x123A32;
    }
}
