package mfdoommod;

import mfdoommod.added.cosmetics.MFDoomBoots;
import mfdoommod.added.cosmetics.MFDoomMask;
import mfdoommod.added.cosmetics.MFDoomShirt;
import mfdoommod.added.foods.Butter;
import mfdoommod.added.foods.Cheddar;
import mfdoommod.added.foods.MacNCheese;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.StaticMessage;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.gfx.GameMusic;
import necesse.inventory.item.miscItem.VinylItem;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import java.awt.Color;

/**
 * Main Class
 *
 * @author RainingDaemons
 * @date 2024-01-12
 */
@ModEntry
public class MainMod {

    public void init() {
        System.out.println("Welcome to MF Doom Mod! :)");

        // Register foods
        ItemRegistry.registerItem("cheddar", new Cheddar().spoilDuration(240), 6.0F, true);
        ItemRegistry.registerItem("butter", new Butter().spoilDuration(240), 4.0F, true);
        ItemRegistry.registerItem("macncheese", new MacNCheese().spoilDuration(240), 40.0F, true);

        // Register cosmetics
        ItemRegistry.registerItem("mfdoom_mask", new MFDoomMask(), 50, true);
        ItemRegistry.registerItem("mfdoom_shirt", new MFDoomShirt(), 50, true);
        ItemRegistry.registerItem("mfdoom_boots", new MFDoomBoots(), 50, true);

        // Register music
        GameMusic RappSnitch;
        RappSnitch = MusicRegistry.registerMusic("rappsnitch", "music/rappsnitch", (GameMessage)null, new StaticMessage("Rapp Snitch Knishes"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(RappSnitch.getStringID() + "vinyl", new VinylItem(RappSnitch), 50.0F, true, false);
    }

    public void initResources() {}

    public void postInit() {
        // Cheddar
        Recipes.registerModRecipe(new Recipe(
                "cheddar",
                4,
                RecipeTechRegistry.COOKING_POT,
                new Ingredient[]{
                        new Ingredient("cheese", 2),
                        new Ingredient("milk", 2)
                }
        ));

        // Butter
        Recipes.registerModRecipe(new Recipe(
                "butter",
                4,
                RecipeTechRegistry.GRAIN_MILL,
                new Ingredient[]{
                        new Ingredient("milk", 1)
                }
        ));

        // Mac & Cheese
        Recipes.registerModRecipe(new Recipe(
                "macncheese",
                1,
                RecipeTechRegistry.COOKING_POT,
                new Ingredient[]{
                        new Ingredient("flour", 2),
                        new Ingredient("butter", 2),
                        new Ingredient("cheddar", 4),
                        new Ingredient("milk", 1)
                }
        ).showAfter("spaghettibolognese")); // Show recipe after fideos con salsa

        // Rapp Snitch Vinyl
        Recipes.registerModRecipe(new Recipe(
                "rappsnitchvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
    }
}