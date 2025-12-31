package nikaxe.rogue.mixin;

import nikaxe.rogue.Rogue;

public class PlayerRespawnBehaviour {
	public static void RegisterRespawnBehaviour() {
		Rogue.LOGGER.info("Registering POST-DEATH event code for " + Rogue.MOD_ID);
	}
}