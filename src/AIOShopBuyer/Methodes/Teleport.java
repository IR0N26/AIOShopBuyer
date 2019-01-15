package AIOShopBuyer.Methodes;

import AIOShopBuyer.Utils.Methodes;
import AIOShopBuyer.Utils.SleepCondition;
import xobot.script.methods.Packets;
import xobot.script.methods.Players;

public class Teleport {
    public static void teleportHome() {
        Packets.sendAction(315, 3, -1, 12856, 0);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 3000);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() == -1;
            }
        }, 5000);
    }
    
    public static void teleportMining() {
        Packets.sendAction(315, 0, 0, 27258, 0);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 3000);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() == -1;
            }
        }, 5000);
    }
    public static void teleportSummoning() {
        Packets.sendAction(315, 1, -1, 29154, 0);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 3000);
        Methodes.conditionalSleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() == -1;
            }
        }, 5000);
    }
    
    
}
