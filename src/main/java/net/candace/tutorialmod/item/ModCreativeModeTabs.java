package net.candace.tutorialmod.item;

import net.candace.tutorialmod.TutorialMod;
import net.candace.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // first step register create mode tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    //step 4

    // first tab is always added to end

    public static final RegistryObject<CreativeModeTab> COURSE_TAB =
            CREATIVE_MODE_TABS.register("course_tab",
                    ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get())) // makes icon for tab
                            .title(Component.translatable("creativetab.tutorialmod.course_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.MAGIC_BLOCK.get());

                                output.accept(ModItems.ALEXANDRITE.get());
                                output.accept(ModItems.RAW_ALEXANDRITE.get());
                                output.accept(ModItems.CHISEL.get());
                                output.accept(ModItems.FRIED_FOOFALAH.get());
                                output.accept(ModItems.PEAT_BRICK.get());

                                output.accept(ModBlocks.ALEXANDRITE_STAIRS.get());
                                output.accept(ModBlocks.ALEXANDRITE_SLAB.get());
                                output.accept(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
                                output.accept(ModBlocks.ALEXANDRITE_BUTTON.get());
                                output.accept(ModBlocks.ALEXANDRITE_DOOR.get());
                                output.accept(ModBlocks.ALEXANDRITE_TRAPDOOR.get());
                                output.accept(ModBlocks.ALEXANDRITE_FENCE.get());
                                output.accept(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
                                output.accept(ModBlocks.ALEXANDRITE_LAMP.get());

                                output.accept(ModItems.ALEXANDRITE_SWORD.get());
                                output.accept(ModItems.ALEXANDRITE_AXE.get());
                                output.accept(ModItems.ALEXANDRITE_PICKAXE.get());
                                output.accept(ModItems.ALEXANDRITE_HOE.get());
                                output.accept(ModItems.ALEXANDRITE_SHOVEL.get());
                                output.accept(ModItems.ALEXANDRITE_HAMMER.get());
                                output.accept(ModItems.ALEXANDRITE_HELMET.get());
                                output.accept(ModItems.ALEXANDRITE_CHESTPLATE.get());
                                output.accept(ModItems.ALEXANDRITE_LEGGINGS.get());
                                output.accept(ModItems.ALEXANDRITE_BOOTS.get());
                                output.accept(ModItems.ALEXANDRITE_HORSE_ARMOR.get());
                                output.accept(ModItems.KAUPEN_SMITHING_TEMPLATE.get());
                                output.accept(ModItems.KAUPEN_BOW.get());

                            }).build()); // title is what is printed over cursor hover
    // with tabs before to get this tab after last one
    // after both new tabs are added here go to langs json and add translation


    // step 2 make register method with IEventBus
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    // step 3 is to go to TutorialMod and register the creative mode tabs above everything else

}
