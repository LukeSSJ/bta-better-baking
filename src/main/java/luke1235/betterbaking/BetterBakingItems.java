package luke1235.betterbaking;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;

public class BetterBakingItems {
	public static Item breadDough;
	public static Item cookieDough;
	public static Item cakeDough;

	public void initializeItems() {
		Item.foodBread.setMaxStackSize(3);

		int id = 16550;
		breadDough = ItemHelper.createItem(BetterBakingMod.MOD_ID, new Item("dough.bread", id++), "breaddough.png");
		cookieDough = ItemHelper.createItem(BetterBakingMod.MOD_ID, new Item("dough.cookie", id++), "cookiedough.png");
		cakeDough = ItemHelper.createItem(BetterBakingMod.MOD_ID, new Item("dough.cake", id++), "cakedough.png");
	}
}
