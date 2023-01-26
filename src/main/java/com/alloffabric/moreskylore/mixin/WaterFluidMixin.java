package com.alloffabric.moreskylore.mixin;

import net.minecraft.fluid.WaterFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WaterFluid.class)
public abstract class WaterFluidMixin {
    @Inject(method = "isInfinite", at = @At("RETURN"), cancellable = true)
    private void inject_isInfinite(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
