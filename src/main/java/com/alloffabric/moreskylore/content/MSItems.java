package com.alloffabric.moreskylore.content;


import com.alloffabric.moreskylore.lib.MSConstants;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.fabric.FabricBotaniaCreativeTab;

import java.util.function.BiConsumer;

public class MSItems {
    private static final Item.Settings props = new FabricItemSettings().group(FabricBotaniaCreativeTab.INSTANCE);
    public static final Item AQUAFORA = new ItemBlockSpecialFlower(MSBlocks.AQUAFORA, props);
    public static final Item FLOATING_AQUAFORA = new ItemBlockSpecialFlower(MSBlocks.FLOATING_AQUAFORA, props);
    public static final Item SPEWOMAGMA = new ItemBlockSpecialFlower(MSBlocks.SPEWOMAGMA, props);
    public static final Item FLOATING_SPEWOMAGMA = new ItemBlockSpecialFlower(MSBlocks.FLOATING_SPEWOMAGMA, props);

    public static void register(BiConsumer<Item, Identifier> r) {
        r.accept(AQUAFORA, MSConstants.id(MSConstants.BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, MSConstants.id(MSConstants.BlockNames.FLOATING_AQUAFORA));
        r.accept(SPEWOMAGMA, MSConstants.id(MSConstants.BlockNames.SPEWOMAGMA));
        r.accept(FLOATING_SPEWOMAGMA, MSConstants.id(MSConstants.BlockNames.FLOATING_SPEWOMAGMA));
    }
}
