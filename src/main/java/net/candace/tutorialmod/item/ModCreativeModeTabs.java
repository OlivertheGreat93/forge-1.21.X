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
    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("alexandrite_items_tab",
                    ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get())) // makes icon for tab
                            .title(Component.translatable("creativetab.tutorialmod.alexandrite_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.ALEXANDRITE.get());
                                output.accept(ModItems.RAW_ALEXANDRITE.get());

                            }).build()); // title is what is printed over cursor hover
    // first tab is always added to end

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
                    ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get())) // makes icon for tab
                            .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                            .title(Component.translatable("creativetab.tutorialmod.alexandrite_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());

                            }).build()); // title is what is printed over cursor hover
    // with tabs before to get this tab after last one
    // after both new tabs are added here go to langs json and add translation


    // step 2 make register method with IEventBus
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    // step 3 is to go to TutorialMod and register the creative mode tabs above everything else

}
