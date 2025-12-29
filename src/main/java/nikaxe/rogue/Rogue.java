package nikaxe.rogue;

import net.fabricmc.api.ModInitializer;

import nikaxe.rogue.item.ModItems;
import nikaxe.rogue.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rogue implements ModInitializer {
	public static final String MOD_ID = "rogue";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModPotions.RegisterPotions();
	}
}