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
        GameMusic MF_RappSnitch, MF_Raid, MF_AllCaps, MF_GreatDay, MF_Accordion, MF_GoWFlow, MF_Doomsday, MF_Figaro, MF_ThatsThat, MF_Ballskin;

        MF_RappSnitch = MusicRegistry.registerMusic("mf_rappsnitch", "music/rappsnitch", (GameMessage)null, new StaticMessage("Rapp Snitch Knishes"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_RappSnitch.getStringID() + "vinyl", new VinylItem(MF_RappSnitch), 50.0F, true, false);
        MF_Raid = MusicRegistry.registerMusic("mf_raid", "music/raid", (GameMessage)null, new StaticMessage("Raid"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_Raid.getStringID() + "vinyl", new VinylItem(MF_Raid), 50.0F, true, false);
        MF_AllCaps = MusicRegistry.registerMusic("mf_allcaps", "music/allcaps", (GameMessage)null, new StaticMessage("All Caps"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_AllCaps.getStringID() + "vinyl", new VinylItem(MF_AllCaps), 50.0F, true, false);
        MF_GreatDay = MusicRegistry.registerMusic("mf_greatday", "music/greatday", (GameMessage)null, new StaticMessage("Great Day"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_GreatDay.getStringID() + "vinyl", new VinylItem(MF_GreatDay), 50.0F, true, false);
        MF_Accordion = MusicRegistry.registerMusic("mf_accordion", "music/accordion", (GameMessage)null, new StaticMessage("Accordion"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_Accordion.getStringID() + "vinyl", new VinylItem(MF_Accordion), 50.0F, true, false);
        MF_GoWFlow = MusicRegistry.registerMusic("mf_gowflow", "music/gowflow", (GameMessage)null, new StaticMessage("Go With The Flow"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_GoWFlow.getStringID() + "vinyl", new VinylItem(MF_GoWFlow), 50.0F, true, false);
        MF_Doomsday = MusicRegistry.registerMusic("mf_doomsday", "music/doomsday", (GameMessage)null, new StaticMessage("Doomsday"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_Doomsday.getStringID() + "vinyl", new VinylItem(MF_Doomsday), 50.0F, true, false);
        MF_Figaro = MusicRegistry.registerMusic("mf_figaro", "music/figaro", (GameMessage)null, new StaticMessage("Figaro"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_Figaro.getStringID() + "vinyl", new VinylItem(MF_Figaro), 50.0F, true, false);
        MF_ThatsThat = MusicRegistry.registerMusic("mf_thatsthat", "music/thatsthat", (GameMessage)null, new StaticMessage("That's That"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_ThatsThat.getStringID() + "vinyl", new VinylItem(MF_ThatsThat), 50.0F, true, false);
        MF_Ballskin = MusicRegistry.registerMusic("mf_ballskin", "music/ballskin", (GameMessage)null, new StaticMessage("Ballskin"), new Color(255, 0, 81), new Color(255, 0, 81));
        ItemRegistry.registerItem(MF_Ballskin.getStringID() + "vinyl", new VinylItem(MF_Ballskin), 50.0F, true, false);
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

        // Vinyls
        Recipes.registerModRecipe(new Recipe(
                "mf_rappsnitchvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_raidvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_allcapsvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_greatdayvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_accordionvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_gowflowvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_doomsdayvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_figarovinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_thatsthatvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "mf_ballskinvinyl",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("macncheese", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
    }
}