package com.alloffabric.skyloreaddons;

import com.alloffabric.skyloreaddons.content.SABlockEntities;
import com.alloffabric.skyloreaddons.content.SABlocks;
import com.alloffabric.skyloreaddons.content.SAItems;
import com.alloffabric.skyloreaddons.lib.SAConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class SkyloreAddons implements ModInitializer {
	@Override
	public void onInitialize() {
		SAConfig.get();
		SABlocks.register((block, id) -> Registry.register(Registry.BLOCK, id, block));
		SABlockEntities.register((blockEntityType, id) -> Registry.register(Registry.BLOCK_ENTITY_TYPE, id, blockEntityType));
		SAItems.register((item, id) -> Registry.register(Registry.ITEM, id, item));
	}

}