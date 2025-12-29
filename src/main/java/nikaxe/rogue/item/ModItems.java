package nikaxe.rogue.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nikaxe.rogue.Rogue;

public class ModItems {
    public static final Item BLINK_POWDER = registerItem("blink_powder", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Rogue.MOD_ID, "blink_powder")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Rogue.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        Rogue.LOGGER.info("Registering ITEMS for " + Rogue.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLINK_POWDER);
        });
    }
}
