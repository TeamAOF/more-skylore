package com.alloffabric.skyloreaddons.lib;

import net.minecraft.util.Identifier;

public class SAConstants {
    public static final String MOD_ID = "skylore-addons";

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static class BlockNames {
        public static final String AQUAFORA = "aquafora";
        public static final String FLOATING_AQUAFORA = "floating_aquafora";
    }
}
