package com.alloffabric.moreskylore;

import com.alloffabric.moreskylore.lib.MSConfig;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MSMixinConfigPlugin implements IMixinConfigPlugin {
    private static Boolean makeWaterFinite;
    private static Boolean removeNetherPortals;


    @Override
    public void onLoad(String mixinPackage) {
        makeWaterFinite = MSConfig.get().makeWaterFinite;
        removeNetherPortals = MSConfig.get().removeNetherPortals;
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return switch (mixinClassName) {
            case "com.alloffabric.moreskylore.mixin.AbstractFireBlockMixin" -> removeNetherPortals;
            case "com.alloffabric.moreskylore.mixin.WaterFluidMixin" -> makeWaterFinite;
            default -> true;
        };
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
