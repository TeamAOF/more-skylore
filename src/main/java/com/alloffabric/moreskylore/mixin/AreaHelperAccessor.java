package com.alloffabric.moreskylore.mixin;

import net.minecraft.world.dimension.AreaHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AreaHelper.class)
public interface AreaHelperAccessor {
    @Accessor
    int getFoundPortalBlocks();
}
