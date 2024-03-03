package luke1235.betterbaking;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class BetterBakingMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "betterbaking";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Better Baking initialized.");
    }

	@Override
	public void beforeGameStart() {
		new BetterBakingItems().initializeItems();
	}

	@Override
	public void afterGameStart() {
	}

	@Override
	public void onRecipesReady() {
		new BetterBakingRecipes().initializeRecipes();
	}
}
