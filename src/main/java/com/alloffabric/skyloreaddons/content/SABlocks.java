package com.alloffabric.skyloreaddons.content;

import com.alloffabric.skyloreaddons.lib.SAConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import vazkii.botania.common.block.BlockFloatingSpecialFlower;
import vazkii.botania.common.block.BlockSpecialFlower;
import vazkii.botania.common.block.ModBlocks;

import java.util.function.BiConsumer;

public class SABlocks {
    public static final Block AQUAFORA = new BlockSpecialFlower(StatusEffects.WATER_BREATHING, 5, FabricBlockSettings.copy(Blocks.POPPY), () -> SABlockEntities.AQUAFORA);
    public static final Block FLOATING_AQUAFORA = new BlockFloatingSpecialFlower(ModBlocks.FLOATING_PROPS, () -> SABlockEntities.AQUAFORA);

    public static void register(BiConsumer<Block, Identifier> r) {
        r.accept(AQUAFORA, SAConstants.id(SAConstants.BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, SAConstants.id(SAConstants.BlockNames.FLOATING_AQUAFORA));
    }
}
