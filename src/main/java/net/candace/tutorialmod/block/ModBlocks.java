package net.candace.tutorialmod.block;

import net.candace.tutorialmod.TutorialMod;
import net.candace.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block; // needs to be the net minecraft world level block Block import
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    //need a way to register our blocks first
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    //register our block 5th
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    // add additional blocks below
    public static final RegistryObject<Block> RAW_ALEXANDRITE_BLOCK = registerBlock("raw_alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops())); //keep normal sound

    public static final RegistryObject<Block> ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE = registerBlock("deepslate_alexandrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_ALEXANDRITE_ORE = registerBlock("nether_alexandrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_ALEXANDRITE_ORE = registerBlock("end_stone_alexandrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));

    // need to register blocks here 4th
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    // helper methods 3rd
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //now need register method 2nd
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
