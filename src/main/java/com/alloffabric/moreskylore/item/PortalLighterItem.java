package com.alloffabric.moreskylore.item;

import com.alloffabric.moreskylore.mixin.AreaHelperAccessor;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.dimension.AreaHelper;

public class PortalLighterItem extends Item {
    public PortalLighterItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var pos = context.getBlockPos();
        var world = context.getWorld();
        if (!world.isClient) {
            var portalHelper = AreaHelper.getOrEmpty(world, pos.offset(Direction.UP), areaHelper -> areaHelper.isValid() && ((AreaHelperAccessor) areaHelper).getFoundPortalBlocks() == 0, Direction.Axis.X);
            if (world.getBlockState(pos).isOf(Blocks.OBSIDIAN) && portalHelper.isPresent() && (world.getRegistryKey() == World.OVERWORLD || world.getRegistryKey() == World.NETHER)) {
                portalHelper.get().createPortal();
                context.getStack().damage(1, context.getPlayer(), p -> p.sendToolBreakStatus(context.getHand()));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}
