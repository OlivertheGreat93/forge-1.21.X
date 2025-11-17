package net.candace.tutorialmod.util;

import net.candace.tutorialmod.TutorialMod;
import net.candace.tutorialmod.component.ModDataComponentTypes;
import net.candace.tutorialmod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "used"),
                (itemStack, clientLevel, livingEntity, i) ->
                itemStack.get(ModDataComponentTypes.COORDINATES.get()) != null ? 1f : 0f);
    }
}
