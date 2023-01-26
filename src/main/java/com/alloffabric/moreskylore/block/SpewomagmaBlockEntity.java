package com.alloffabric.moreskylore.block;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.lib.MSConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import vazkii.botania.api.subtile.RadiusDescriptor;
import vazkii.botania.api.subtile.TileEntityFunctionalFlower;

public class SpewomagmaBlockEntity extends TileEntityFunctionalFlower {
    protected static final int COST = MSConfig.get().spewomagmaManaCost;
    protected static final int range = MSConfig.get().spewomagmaRange;

    public SpewomagmaBlockEntity(BlockPos pos, BlockState state) {
        super(MSBlockEntities.SPEWOMAGMA, pos, state);
    }

    @Override
    public void tickFlower() {
        super.tickFlower();

        var world = getWorld();
        if (world.isClient || getMana() <= 0) {
            return;
        }

        var effectivePos = getEffectivePos();
        var did = false;
        for (var pos : BlockPos.iterate(effectivePos.add(-range, -1, -range), effectivePos.add(range, -1, range))) {
            var state = world.getBlockState(pos);
            if ((state.isAir() || (state.isOf(Blocks.LAVA) && !Blocks.LAVA.getFluidState(state).isStill())) && getMana() >= COST) {
                world.setBlockState(pos, Blocks.LAVA.getDefaultState(), Block.NOTIFY_LISTENERS);
                addMana(-COST);

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
    public int getMaxMana() {
        return (int) (COST * 1.5);
    }

    @Override
    public int getColor() {
        return 0;
    }

    @Nullable
    @Override
    public RadiusDescriptor getRadius() {
        return RadiusDescriptor.Rectangle.square(getEffectivePos(), range);
    }
}
