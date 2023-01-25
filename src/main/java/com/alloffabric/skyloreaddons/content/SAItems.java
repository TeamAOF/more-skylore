package com.alloffabric.skyloreaddons.content;


import com.alloffabric.skyloreaddons.lib.SAConstants;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.fabric.FabricBotaniaCreativeTab;

import java.util.function.BiConsumer;

public class SAItems {
    private static final Item.Settings props = new FabricItemSettings().group(FabricBotaniaCreativeTab.INSTANCE);
    public static final Item AQUAFORA = new ItemBlockSpecialFlower(SABlocks.AQUAFORA, props);
    public static final Item FLOATING_AQUAFORA = new ItemBlockSpecialFlower(SABlocks.FLOATING_AQUAFORA, props);

    public static void register(BiConsumer<Item, Identifier> r) {
        r.accept(AQUAFORA, SAConstants.id(SAConstants.BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, SAConstants.id(SAConstants.BlockNames.FLOATING_AQUAFORA));
    }
}
