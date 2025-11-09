package net.candace.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties FRIED_FOOFALAH = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(.25f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1F).build();

}
