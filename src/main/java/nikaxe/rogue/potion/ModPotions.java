package nikaxe.rogue.potion;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import nikaxe.rogue.Rogue;

public class ModPotions {
    public static final Holder<Potion> UNSTABLE_RECALL_POTION = registerPotion("unstable_recall_potion", new Potion("unstable_recall_potion", new MobEffectInstance(MobEffects.LEVITATION, 3600, 0)));

    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(Rogue.MOD_ID, name), potion);
    }

    public static void RegisterPotions() {
        Rogue.LOGGER.info("Registering POTIONS for " + Rogue.MOD_ID);
        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        Rogue.LOGGER.info("Registering POTION RECIPES for " + Rogue.MOD_ID);

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.addMix(Potions.AWKWARD, Items.ENDER_PEARL, UNSTABLE_RECALL_POTION);
        });
    }
}
