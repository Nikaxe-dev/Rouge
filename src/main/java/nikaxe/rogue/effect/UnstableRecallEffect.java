package nikaxe.rogue.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;
import nikaxe.rogue.Rogue;

public class UnstableRecallEffect extends StatusEffect {
    public UnstableRecallEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        StatusEffectInstance effectInstance = entity.getStatusEffect(ModEffects.UNSTABLE_RECALL_EFFECT);

        if(effectInstance != null) {
            int ticksRemaining = effectInstance.getDuration();

            if(ticksRemaining <= 0) {
                Rogue.LOGGER.info("Potion effect working");
            }
        }

        return super.applyUpdateEffect(world, entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
