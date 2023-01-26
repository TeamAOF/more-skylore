package com.alloffabric.moreskylore;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.content.MSBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import vazkii.botania.client.render.tile.RenderTileSpecialFlower;

public class MoreSkyloreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), MSBlocks.AQUAFORA);
        BlockEntityRendererRegistry.register(MSBlockEntities.AQUAFORA, RenderTileSpecialFlower::new);
    }
}
