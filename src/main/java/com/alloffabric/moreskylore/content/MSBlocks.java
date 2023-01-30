package com.alloffabric.moreskylore.content;

import com.alloffabric.moreskylore.block.research.ResearchTableBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import vazkii.botania.common.block.BlockFloatingSpecialFlower;
import vazkii.botania.common.block.BlockSpecialFlower;
import vazkii.botania.common.block.ModBlocks;

import java.util.function.BiConsumer;

import static com.alloffabric.moreskylore.lib.MSConstants.*;

public class MSBlocks {
    public static final Block AQUAFORA = new BlockSpecialFlower(StatusEffects.WATER_BREATHING, 5, FabricBlockSettings.copy(Blocks.POPPY), () -> MSBlockEntities.AQUAFORA);
    public static final Block FLOATING_AQUAFORA = new BlockFloatingSpecialFlower(ModBlocks.FLOATING_PROPS, () -> MSBlockEntities.AQUAFORA);
    public static final Block SPEWOMAGMA = new BlockSpecialFlower(StatusEffects.GLOWING, 10, FabricBlockSettings.copy(Blocks.POPPY), () -> MSBlockEntities.SPEWOMAGMA);
    public static final Block FLOATING_SPEWOMAGMA = new BlockFloatingSpecialFlower(ModBlocks.FLOATING_PROPS, () -> MSBlockEntities.SPEWOMAGMA);
    public static final Block RESEARCH_TABLE = new ResearchTableBlock(FabricBlockSettings.copy(Blocks.LECTERN));

    public static void register(BiConsumer<Block, Identifier> r) {
        r.accept(AQUAFORA, id(BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, id(BlockNames.FLOATING_AQUAFORA));
        r.accept(SPEWOMAGMA, id(BlockNames.SPEWOMAGMA));
        r.accept(FLOATING_SPEWOMAGMA, id(BlockNames.FLOATING_SPEWOMAGMA));
        r.accept(RESEARCH_TABLE, id(BlockNames.RESEARCH_TABLE));
    }
}
