package com.alloffabric.moreskylore.lib;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

@Config(name = MSConstants.MOD_ID)
public class MSConfig implements ConfigData {
    public int aquaforaManaCost = 1_200;
    public int aquaforaRange = 1;
    public boolean makeWaterFinite = true;
    public int spewomagmaManaCost = 15_000;
    public int spewomagmaRange = 1;
    public boolean removeNetherPortals = true;

    private static MSConfig config;

    static {
        AutoConfig.register(MSConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(MSConfig.class).getConfig();
    }

    public static MSConfig get() {
        return config;
    }
}
