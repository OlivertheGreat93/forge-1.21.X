package net.candace.tutorialmod.datagen;

import net.candace.tutorialmod.TutorialMod;
import net.candace.tutorialmod.block.ModBlocks;
import net.candace.tutorialmod.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
                ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                ModBlocks.NETHER_ALEXANDRITE_ORE.get(), ModBlocks.END_STONE_ALEXANDRITE_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .define('#', Items.STICK) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .define('#', Items.STICK) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .define('#', Items.STICK) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .define('#', Items.STICK) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.ALEXANDRITE.get()) //* make sure single quote for char
                .define('#', Items.STICK) //* make sure single quote for char
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALEXANDRITE_BLOCK.get()), has(ModBlocks.ALEXANDRITE_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 32)
                .requires(ModBlocks.MAGIC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALEXANDRITE_BLOCK.get()), has(ModBlocks.ALEXANDRITE_BLOCK.get()))
                .save(pRecipeOutput, TutorialMod.MOD_ID + ":alexandrite_from_magic_block");

        oreSmelting(pRecipeOutput, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pRecipeOutput, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alexandrite");

        stairBuilder(ModBlocks.ALEXANDRITE_STAIRS.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALEXANDRITE_SLAB.get(), ModItems.ALEXANDRITE.get());

        buttonBuilder(ModBlocks.ALEXANDRITE_BUTTON.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get(), ModItems.ALEXANDRITE.get());

        fenceBuilder(ModBlocks.ALEXANDRITE_FENCE.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.ALEXANDRITE_FENCE_GATE.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALEXANDRITE_WALL.get(), ModItems.ALEXANDRITE.get());

        doorBuilder(ModBlocks.ALEXANDRITE_DOOR.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.ALEXANDRITE_TRAPDOOR.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);


    }

    protected static void oreSmelting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pSerializer, AbstractCookingRecipe.Factory<T> pRecipeFactory,
                                                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, TutorialMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }


}
