package mfdoommod.patch;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.network.server.ServerClient;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.friendly.human.humanShop.StylistHumanMob;
import necesse.level.maps.levelData.villageShops.ShopItem;
import necesse.level.maps.levelData.villageShops.VillageShopsData;
import net.bytebuddy.asm.Advice;

import java.util.ArrayList;

@ModMethodPatch(target = StylistHumanMob.class, name = "getShopItems", arguments = {VillageShopsData.class, ServerClient.class})
public class StylistShopPatch {
    @Advice.OnMethodExit
    static void onExit(@Advice.This StylistHumanMob stylist, @Advice.Return(readOnly = false) ArrayList<ShopItem> shopItems) {
        if (shopItems == null) {
            return;
        }
        GameRandom random = new GameRandom(stylist.getShopSeed() + 5);
        shopItems.add(ShopItem.item("mfdoom_mask", stylist.getRandomHappinessPrice(random, 1000, 3000, 100)));
        shopItems.add(ShopItem.item("mfdoom_shirt", stylist.getRandomHappinessPrice(random, 1000, 3000, 100)));
        shopItems.add(ShopItem.item("mfdoom_boots", stylist.getRandomHappinessPrice(random, 1000, 3000, 100)));
    }
}