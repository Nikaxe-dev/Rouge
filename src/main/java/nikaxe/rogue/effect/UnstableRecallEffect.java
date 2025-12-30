package nikaxe.rogue.effect;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import nikaxe.rogue.Rogue;

public class UnstableRecallEffect extends MobEffect {
    public UnstableRecallEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel world, LivingEntity entity, int amplifier) {
//        MobEffectInstance effectInstance = entity.getEffect(ModEffects.UNSTABLE_RECALL_EFFECT);
//
//        if(effectInstance != null) {
//            int ticksRemaining = effectInstance.getDuration();
//
//            if(ticksRemaining <= 0) {
//                Rogue.LOGGER.info("Potion effect working");
//            }
//        }

        return super.applyEffectTick(world, entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
