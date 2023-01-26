package com.alloffabric.moreskylore;

import com.alloffabric.moreskylore.lib.MSConfig;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MSMixinConfigPlugin implements IMixinConfigPlugin {
    private static Boolean shouldWaterBeFinite;

    // Just a precaution in case this setting somehow gets changed at a wrong time
    private boolean shouldWaterBeFinite() {
        if (shouldWaterBeFinite == null) {
            shouldWaterBeFinite = MSConfig.get().makeWaterFinite;
        }
        return shouldWaterBeFinite;
    }

    @Override
    public void onLoad(String mixinPackage) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return !mixinClassName.equals("com.alloffabric.moreskylore.mixin.WaterFluidMixin") || shouldWaterBeFinite();
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}
