package com.alloffabric.skyloreaddons.lib;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

@Config(name = SAConstants.MOD_ID)
public class SAConfig implements ConfigData {
    public int aquaforaManaCost = 1000;
    public int aquaforaRange = 1;
    public boolean makeWaterFinite = true;

    private static SAConfig config;

    static {
        AutoConfig.register(SAConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(SAConfig.class).getConfig();
    }

    public static SAConfig get() {
        return config;
    }
}
