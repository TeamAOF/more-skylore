package com.alloffabric.moreskylore.block.research;

import com.alloffabric.moreskylore.MoreSkylore;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class ResearchTableScreenHandler extends ScreenHandler {
    private final SimpleInventory inventory;

    public ResearchTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(14));
    }

    public ResearchTableScreenHandler(int syncId, PlayerInventory playerInventory, SimpleInventory passedInventory) {
        super(MoreSkylore.RESEARCH_TABLE_SCREEN_HANDLER, syncId);
        this.inventory = passedInventory;
        inventory.onOpen(playerInventory.player);

        int m;
        int l;
        //Our inventory
        for (m = 0; m < 2; ++m) {
            for (l = 0; l < 7; ++l) {
                this.addSlot(new Slot(inventory, l + m * 3, 62 + l * 18, 17 + m * 18));
            }
        }
        //The player inventory
        for (m = 0; m < 3; ++m) {
            for (l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18));
            }
        }
        //The player Hotbar
        for (m = 0; m < 9; ++m) {
            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 142));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return inventory.canPlayerUse(player);
    }
}
