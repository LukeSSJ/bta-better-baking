package luke1235.betterbaking;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;

public class BetterBakingRecipes {

	public void initializeRecipes() {
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bread");
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("cookie");
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("cake");

		RecipeBuilder.Shapeless(BetterBakingMod.MOD_ID)
			.addInput(Item.wheat)
			.addInput(Item.wheat)
			.addInput(Item.wheat)
			.addInput(Item.bucketWater)
			.create("bread_dough", BetterBakingItems.breadDough.getDefaultStack());
		RecipeBuilder.Shapeless(BetterBakingMod.MOD_ID)
			.addInput(Item.wheat)
			.addInput(new ItemStack(Item.dye, 1, DyeColor.DYE_BROWN.dyeMeta))
			.addInput(Item.dustSugar)
			.addInput(Item.bucketWater)
			.create("cookie_dough", BetterBakingItems.cookieDough.getDefaultStack());
		RecipeBuilder.Shaped(BetterBakingMod.MOD_ID, "MMM", "SES", "WWW")
			.addInput('M', Item.bucketMilk.getDefaultStack())
			.addInput('S', Item.dustSugar.getDefaultStack())
			.addInput('E', Item.eggChicken.getDefaultStack())
			.addInput('W', Item.wheat.getDefaultStack())
			.create("cake_dough", BetterBakingItems.cakeDough.getDefaultStack());

		RecipeBuilder.Furnace(BetterBakingMod.MOD_ID)
			.setInput(BetterBakingItems.breadDough)
			.create("cooked_bread", new ItemStack(Item.foodBread, 3));
		RecipeBuilder.Furnace(BetterBakingMod.MOD_ID)
			.setInput(BetterBakingItems.cookieDough)
			.create("cooked_cookie", new ItemStack(Item.foodCookie, 8));
		RecipeBuilder.Furnace(BetterBakingMod.MOD_ID)
			.setInput(BetterBakingItems.cakeDough)
			.create("cooked_cake", Item.foodCake.getDefaultStack());
	}
}
