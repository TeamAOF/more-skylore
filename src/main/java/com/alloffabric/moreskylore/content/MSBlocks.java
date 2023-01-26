package com.alloffabric.moreskylore.content;

import com.alloffabric.moreskylore.lib.MSConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import vazkii.botania.common.block.BlockFloatingSpecialFlower;
import vazkii.botania.common.block.BlockSpecialFlower;
import vazkii.botania.common.block.ModBlocks;

import java.util.function.BiConsumer;

public class MSBlocks {
    public static final Block AQUAFORA = new BlockSpecialFlower(StatusEffects.WATER_BREATHING, 5, FabricBlockSettings.copy(Blocks.POPPY), () -> MSBlockEntities.AQUAFORA);
    public static final Block FLOATING_AQUAFORA = new BlockFloatingSpecialFlower(ModBlocks.FLOATING_PROPS, () -> MSBlockEntities.AQUAFORA);

    public static void register(BiConsumer<Block, Identifier> r) {
        r.accept(AQUAFORA, MSConstants.id(MSConstants.BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, MSConstants.id(MSConstants.BlockNames.FLOATING_AQUAFORA));
    }
}
