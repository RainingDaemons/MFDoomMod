package mfdoommod.added.foods;

import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.inventory.item.placeableItem.consumableItem.food.FoodConsumableItem;
import necesse.level.maps.levelData.settlementData.settler.Settler;

public class Cheddar extends FoodConsumableItem {

    public Cheddar() { super(100, Rarity.UNCOMMON, Settler.FOOD_FINE, 35, 720, true, new ModifierValue[]{new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.15F)}); }

}
