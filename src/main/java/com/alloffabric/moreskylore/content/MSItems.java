package com.alloffabric.moreskylore.content;


import com.alloffabric.moreskylore.item.PortalLighterItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.fabric.FabricBotaniaCreativeTab;

import java.util.function.BiConsumer;

import static com.alloffabric.moreskylore.lib.MSConstants.*;

public class MSItems {
    private static final Item.Settings props = new FabricItemSettings().group(FabricBotaniaCreativeTab.INSTANCE);
    public static final Item AQUAFORA = new ItemBlockSpecialFlower(MSBlocks.AQUAFORA, props);
    public static final Item FLOATING_AQUAFORA = new ItemBlockSpecialFlower(MSBlocks.FLOATING_AQUAFORA, props);
    public static final Item SPEWOMAGMA = new ItemBlockSpecialFlower(MSBlocks.SPEWOMAGMA, props);
    public static final Item FLOATING_SPEWOMAGMA = new ItemBlockSpecialFlower(MSBlocks.FLOATING_SPEWOMAGMA, props);
    public static final Item RESEARCH_TABLE = new BlockItem(MSBlocks.RESEARCH_TABLE, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Item PORTAL_LIGHTER = new PortalLighterItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxDamage(4));

    public static void register(BiConsumer<Item, Identifier> r) {
        //noinspection Duplicates
        r.accept(AQUAFORA, id(BlockNames.AQUAFORA));
        r.accept(FLOATING_AQUAFORA, id(BlockNames.FLOATING_AQUAFORA));
        r.accept(SPEWOMAGMA, id(BlockNames.SPEWOMAGMA));
        r.accept(FLOATING_SPEWOMAGMA, id(BlockNames.FLOATING_SPEWOMAGMA));
        r.accept(RESEARCH_TABLE, id(BlockNames.RESEARCH_TABLE));
        r.accept(PORTAL_LIGHTER, id(ItemNames.PORTAL_LIGHTER));
    }
}
