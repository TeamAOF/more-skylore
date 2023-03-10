package com.alloffabric.moreskylore.lib;

import net.minecraft.util.Identifier;

public class MSConstants {
    public static final String MOD_ID = "moreskylore";

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static class BlockNames {
        public static final String AQUAFORA = "aquafora";
        public static final String FLOATING_AQUAFORA = "floating_aquafora";
        public static final String SPEWOMAGMA = "spewomagma";
        public static final String FLOATING_SPEWOMAGMA = "floating_spewomagma";
        public static final String RESEARCH_TABLE = "research_table";
    }

    public static class ItemNames {
        public static final String PORTAL_LIGHTER = "portal_lighter";
    }

    public static class NbtNames {
        public static final String INVENTORY = "inventory";
    }
}
