package nikaxe.rogue;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DropMaterials {
    private static boolean isGear(ItemStack stack) {
        return stack.isEmpty() || stack.isDamageableItem();
    }

    public static void DropHalfNonGear(ServerPlayer player) {
        if(player.level().isClientSide()) return;

        Inventory inv = player.getInventory();

        for (int slot = 0; slot < inv.getContainerSize(); slot++) {
            if(slot == Inventory.SLOT_OFFHAND) continue;

            ItemStack stack = inv.getItem(slot);
            if(stack.isEmpty()) continue;
            if(isGear(stack)) continue;

            int dropcount = stack.getCount() / 2;
            if(dropcount <= 0) continue;

            stack.shrink(dropcount);

            // DISABLED: REMOVES FROM INVENTORY COMPLETELY AND ONLY DROPS HALF
            // FIX

//            ItemStack dropped = stack.copy();
//            dropped.setCount(dropcount);
//
//            stack.shrink(dropcount);
//            player.drop(dropped, true, false);
        }
    }
}
