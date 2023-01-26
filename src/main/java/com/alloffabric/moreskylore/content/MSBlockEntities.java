package com.alloffabric.moreskylore.content;

import com.alloffabric.moreskylore.block.AquaforaBlockEntity;
import com.alloffabric.moreskylore.block.SpewomagmaBlockEntity;
import com.alloffabric.moreskylore.lib.MSConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class MSBlockEntities {
    public static final BlockEntityType<AquaforaBlockEntity> AQUAFORA = FabricBlockEntityTypeBuilder.create(AquaforaBlockEntity::new, MSBlocks.AQUAFORA, MSBlocks.FLOATING_AQUAFORA).build();
    public static final BlockEntityType<SpewomagmaBlockEntity> SPEWOMAGMA = FabricBlockEntityTypeBuilder.create(SpewomagmaBlockEntity::new, MSBlocks.SPEWOMAGMA, MSBlocks.FLOATING_SPEWOMAGMA).build();

    public static void register(BiConsumer<BlockEntityType<?>, Identifier> r) {
        r.accept(AQUAFORA, MSConstants.id(MSConstants.BlockNames.AQUAFORA));
        r.accept(SPEWOMAGMA, MSConstants.id(MSConstants.BlockNames.SPEWOMAGMA));
    }
}
