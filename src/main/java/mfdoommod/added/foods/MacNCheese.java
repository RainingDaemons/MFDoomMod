package mfdoommod.added.foods;

import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.inventory.item.placeableItem.consumableItem.food.FoodConsumableItem;
import necesse.level.maps.levelData.settlementData.settler.Settler;

public class MacNCheese extends FoodConsumableItem {

    public MacNCheese() { super(100, Rarity.EPIC, Settler.FOOD_GOURMET, 80, 1200, true, new ModifierValue[]{new ModifierValue(BuffModifiers.ALL_DAMAGE, 0.2F), new ModifierValue(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 0.8F), new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 50)}); }

}
