package com.alloffabric.moreskylore.block.botania;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.lib.MSConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class SpewomagmaBlockEntity extends FluidPlacingFlowerBlockEntity {
    protected final int COST = MSConfig.get().spewomagmaManaCost;
    protected final int MAX_MANA = (int) (COST * 1.5);
    protected final int RANGE = MSConfig.get().spewomagmaRange;

    public SpewomagmaBlockEntity(BlockPos pos, BlockState state) {
        super(MSBlockEntities.SPEWOMAGMA, pos, state);
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
        return Blocks.LAVA;
    }

    @Override
    public int getMaxMana() {
        return MAX_MANA;
    }

    @Override
    public int getColor() {
        return 0x601705;
    }
}
