package com.alloffabric.moreskylore.content;

import com.alloffabric.moreskylore.block.botania.AquaforaBlockEntity;
import com.alloffabric.moreskylore.block.botania.SpewomagmaBlockEntity;
import com.alloffabric.moreskylore.block.research.ResearchTableBlockEntity;
import com.alloffabric.moreskylore.lib.MSConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

import static com.alloffabric.moreskylore.lib.MSConstants.*;

public class MSBlockEntities {
    public static final BlockEntityType<AquaforaBlockEntity> AQUAFORA = FabricBlockEntityTypeBuilder.create(AquaforaBlockEntity::new, MSBlocks.AQUAFORA, MSBlocks.FLOATING_AQUAFORA).build();
    public static final BlockEntityType<SpewomagmaBlockEntity> SPEWOMAGMA = FabricBlockEntityTypeBuilder.create(SpewomagmaBlockEntity::new, MSBlocks.SPEWOMAGMA, MSBlocks.FLOATING_SPEWOMAGMA).build();
    public static final BlockEntityType<ResearchTableBlockEntity> RESEARCH_TABLE = FabricBlockEntityTypeBuilder.create(ResearchTableBlockEntity::new, MSBlocks.RESEARCH_TABLE).build();

    public static void register(BiConsumer<BlockEntityType<?>, Identifier> r) {
        r.accept(AQUAFORA, id(BlockNames.AQUAFORA));
        r.accept(SPEWOMAGMA, id(BlockNames.SPEWOMAGMA));
        r.accept(RESEARCH_TABLE, id(BlockNames.RESEARCH_TABLE));
    }
}
