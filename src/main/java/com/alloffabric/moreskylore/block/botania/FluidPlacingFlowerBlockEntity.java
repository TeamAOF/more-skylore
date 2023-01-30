package com.alloffabric.moreskylore.block.botania;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import vazkii.botania.api.subtile.RadiusDescriptor;
import vazkii.botania.api.subtile.TileEntityFunctionalFlower;

public abstract class FluidPlacingFlowerBlockEntity extends TileEntityFunctionalFlower {
    public FluidPlacingFlowerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public abstract int getRange();

    public abstract int getCost();

    public abstract Block getFluidBlock();
    @Override
    public void tickFlower() {
        super.tickFlower();

        var world = getWorld();
        if (world.isClient || getMana() <= 0) {
            return;
        }

        var effectivePos = getEffectivePos();
        var did = false;
        for (var pos : BlockPos.iterate(effectivePos.add(-getRange(), -1, -getRange()), effectivePos.add(getRange(), -1, getRange()))) {
            var state = world.getBlockState(pos);
            if ((state.isAir() || (state.isOf(getFluidBlock()) && !getFluidBlock().getFluidState(state).isStill())) && getMana() >= getCost()) {
                world.setBlockState(pos, getFluidBlock().getDefaultState(), Block.NOTIFY_LISTENERS);
                addMana(-getCost());

                if (getMana() <= 0) {
                    did = true;
                    break;
                }
            }
        }
        if (did) {
            sync();
        }
    }

    @Override
    public RadiusDescriptor getRadius() {
        return RadiusDescriptor.Rectangle.square(getEffectivePos(), getRange());
    }
}
