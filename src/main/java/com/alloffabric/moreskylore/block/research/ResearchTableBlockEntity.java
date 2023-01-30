package com.alloffabric.moreskylore.block.research;

import com.alloffabric.moreskylore.content.MSBlockEntities;
import com.alloffabric.moreskylore.lib.MSConstants;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class ResearchTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory {
    protected final SimpleInventory inventory = new SimpleInventory(14);

    public ResearchTableBlockEntity(BlockPos pos, BlockState state) {
        super(MSBlockEntities.RESEARCH_TABLE, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ResearchTableScreenHandler(syncId, inv, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        inventory.readNbtList(nbt.getList(MSConstants.NbtNames.INVENTORY, NbtElement.COMPOUND_TYPE));
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.put(MSConstants.NbtNames.INVENTORY, inventory.toNbtList());
    }
}
