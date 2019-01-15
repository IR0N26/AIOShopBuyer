package AIOShopBuyer.Methodes;

import AIOShopBuyer.Data.Data;
import AIOShopBuyer.Utils.Methodes;
import AIOShopBuyer.Utils.SleepCondition;
import xobot.script.methods.NPCs;
import xobot.script.methods.Players;
import xobot.script.methods.Shop;
import xobot.script.wrappers.Area;
import xobot.script.wrappers.interactive.NPC;

public class Buy {

	public static boolean canBuy() {
		NPC shop = NPCs.getNearest(Data.SHOP_ID);
		return shop != null && shop.isReachable();

	}
	
	public static void doBuy() {
		NPC shop = NPCs.getNearest(Data.SHOP_ID);
		if (!shop.isReachable()) {

		}
		if (shop != null && !Shop.isOpen()) {
			shop.interact("trade");
			Methodes.conditionalSleep(new SleepCondition() {
                @Override
                public boolean isValid() {
                    return Shop.isOpen();
                }
            }, 8000);
		}
		
		if (Shop.isOpen()) {
			System.out.println("Item ID - " + Data.ITEM_ID_TO_BUY);
			Shop.buy(Data.ITEM_ID_TO_BUY, 28);
		}
	}
	
    public static boolean isAtShop(){
		NPC shop = NPCs.getNearest(Data.SHOP_ID);
		if (shop != null && shop.isReachable()){
        	return true;
        }
        return false;
    }
}
