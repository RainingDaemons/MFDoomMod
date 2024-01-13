package mfdoommod.added.foods;

import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.inventory.item.placeableItem.consumableItem.food.FoodConsumableItem;
import necesse.level.maps.levelData.settlementData.settler.Settler;

public class Butter extends FoodConsumableItem {

    public Butter() { super(100, Rarity.UNCOMMON, Settler.FOOD_FINE, 20, 480, true, new ModifierValue[]{new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.1F)}); }

}
