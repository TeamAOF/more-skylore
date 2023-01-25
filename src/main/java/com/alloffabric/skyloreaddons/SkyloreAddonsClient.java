package com.alloffabric.skyloreaddons;

import com.alloffabric.skyloreaddons.content.SABlockEntities;
import com.alloffabric.skyloreaddons.content.SABlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import vazkii.botania.client.render.tile.RenderTileSpecialFlower;

public class SkyloreAddonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), SABlocks.AQUAFORA);
        BlockEntityRendererRegistry.register(SABlockEntities.AQUAFORA, RenderTileSpecialFlower::new);
    }
}
