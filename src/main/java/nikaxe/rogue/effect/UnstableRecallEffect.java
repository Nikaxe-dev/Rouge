package nikaxe.rogue.effect;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.Commands;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.portal.TeleportTransition;
import net.minecraft.world.phys.Vec3;
import nikaxe.rogue.DropMaterials;
import nikaxe.rogue.Rogue;

public class UnstableRecallEffect extends MobEffect {
    public UnstableRecallEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel world, LivingEntity entity, int amplifier) {
        ServerLevel camp = world.getServer().getLevel(Rogue.CAMP_LEVEL);

        Rogue.LOGGER.info(camp != null ? "serverlevel camp exists" : "serverlevel camp doesnt exist");

        if (camp != null) {
            if(entity instanceof ServerPlayer) {
                DropMaterials.DropHalfNonGear((ServerPlayer) entity);
            }
            entity.teleport(new TeleportTransition(camp, new Vec3(0, 0, 0), new Vec3(0, 0, 0), 0, 0, TeleportTransition.DO_NOTHING));
        }

        return super.applyEffectTick(world, entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration == 1;
    }

    @Override
    public void onEffectStarted(LivingEntity entity, int i) {
        super.onEffectStarted(entity, i);
        MobEffectInstance effect = entity.getEffect(ModEffects.UNSTABLE_RECALL_EFFECT);
        //entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, effect.getDuration() + 40, 1000));
        entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, effect.getDuration(), 2));
    }
}
