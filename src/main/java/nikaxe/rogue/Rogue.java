package nikaxe.rogue;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import nikaxe.rogue.effect.ModEffects;
import nikaxe.rogue.item.ModItems;
import nikaxe.rogue.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rogue implements ModInitializer {
	public static final String MOD_ID = "rogue";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ResourceKey<Level> CAMP_LEVEL = ResourceKey.create(Level.OVERWORLD.registryKey(), Identifier.fromNamespaceAndPath("rogue", "camp"));

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModEffects.RegisterEffects();
		ModPotions.RegisterPotions();
	}
}