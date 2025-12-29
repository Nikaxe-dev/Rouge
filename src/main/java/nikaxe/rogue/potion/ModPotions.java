package nikaxe.rogue.potion;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import nikaxe.rogue.Rogue;

public class ModPotions {
    public static final RegistryEntry<Potion> UNSTABLE_RECALL_POTION = registerPotion("unstable_recall_potion", new Potion("unstable_recall_potion", new StatusEffectInstance(StatusEffects.LEVITATION, 3600, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Rogue.MOD_ID, name), potion);
    }

    public static void RegisterPotions() {
        Rogue.LOGGER.info("Registering POTIONS for " + Rogue.MOD_ID);
        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        Rogue.LOGGER.info("Registering POTION RECIPES for " + Rogue.MOD_ID);

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, Items.ENDER_PEARL, UNSTABLE_RECALL_POTION);
        });
    }
}
