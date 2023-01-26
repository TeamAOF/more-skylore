package com.alloffabric.moreskylore;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.content.MSBlocks;
import com.alloffabric.moreskylore.content.MSItems;
import com.alloffabric.moreskylore.lib.MSConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class MoreSkylore implements ModInitializer {
	@Override
	public void onInitialize() {
		MSConfig.get();
		MSBlocks.register((block, id) -> Registry.register(Registry.BLOCK, id, block));
		MSBlockEntities.register((blockEntityType, id) -> Registry.register(Registry.BLOCK_ENTITY_TYPE, id, blockEntityType));
		MSItems.register((item, id) -> Registry.register(Registry.ITEM, id, item));
	}

}