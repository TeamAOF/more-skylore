package com.alloffabric.moreskylore;

import com.alloffabric.moreskylore.block.research.ResearchTableScreenHandler;
import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.content.MSBlocks;
import com.alloffabric.moreskylore.content.MSItems;
import com.alloffabric.moreskylore.lib.MSConfig;
import com.alloffabric.moreskylore.lib.MSConstants;
import net.fabricmc.api.ModInitializer;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class MoreSkylore implements ModInitializer {
	public static ScreenHandlerType<ResearchTableScreenHandler> RESEARCH_TABLE_SCREEN_HANDLER;

	@Override
	public void onInitialize() {
		MSConfig.get();
		MSBlocks.register((block, id) -> Registry.register(Registry.BLOCK, id, block));
		MSBlockEntities.register((blockEntityType, id) -> Registry.register(Registry.BLOCK_ENTITY_TYPE, id, blockEntityType));
		MSItems.register((item, id) -> Registry.register(Registry.ITEM, id, item));

		RESEARCH_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(ResearchTableScreenHandler::new);
		Registry.register(Registry.SCREEN_HANDLER, MSConstants.id(MSConstants.BlockNames.RESEARCH_TABLE), RESEARCH_TABLE_SCREEN_HANDLER);
	}
}