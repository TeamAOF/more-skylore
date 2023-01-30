package com.alloffabric.moreskylore.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.AreaHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AreaHelper.class)
public class AreaHelperMixin {
    @Inject(method = "getNewPortal", at = @At("RETURN"), cancellable = true)
    private static void inject_getNewPortal(WorldAccess world, BlockPos pos, Direction.Axis axis, CallbackInfoReturnable<Optional<AreaHelper>> cir) {
        cir.setReturnValue(Optional.empty());
    }
}
