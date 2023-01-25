package com.alloffabric.skyloreaddons.content;

import com.alloffabric.skyloreaddons.block.AquaforaBlockEntity;
import com.alloffabric.skyloreaddons.lib.SAConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class SABlockEntities {
    public static final BlockEntityType<AquaforaBlockEntity> AQUAFORA = FabricBlockEntityTypeBuilder.create(AquaforaBlockEntity::new, SABlocks.AQUAFORA, SABlocks.FLOATING_AQUAFORA).build();

    public static void register(BiConsumer<BlockEntityType<?>, Identifier> r) {
        r.accept(AQUAFORA, SAConstants.id(SAConstants.BlockNames.AQUAFORA));
    }
}
