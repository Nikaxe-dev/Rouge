package nikaxe.rogue.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import nikaxe.rogue.Rogue;

public class ModEffects {
    public static final Holder<MobEffect> UNSTABLE_RECALL_EFFECT = registerStatusEffect("unstable_recall", new UnstableRecallEffect(MobEffectCategory.NEUTRAL, 0x5716fa).setBlendDuration(150, 20, 60));

    private static Holder<MobEffect> registerStatusEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(Rogue.MOD_ID, name), effect);
    }

    public static void RegisterEffects() {
        Rogue.LOGGER.info("Registering STATUS EFFECTS for " + Rogue.MOD_ID);
    }
}
