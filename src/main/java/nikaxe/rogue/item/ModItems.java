package nikaxe.rogue.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import nikaxe.rogue.Rogue;

public class ModItems {
    public static final Item BLINK_POWDER = registerItem("blink_powder", new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Rogue.MOD_ID, "blink_powder")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Rogue.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        Rogue.LOGGER.info("Registering ITEMS for " + Rogue.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(BLINK_POWDER);
        });
    }
}