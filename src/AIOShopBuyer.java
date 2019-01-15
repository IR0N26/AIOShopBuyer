import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.*;

import AIOShopBuyer.Data.Data;
import xobot.script.methods.GameObjects;
import AIOShopBuyer.Methodes.Banking;
import AIOShopBuyer.Methodes.Buy;
import AIOShopBuyer.Methodes.Teleport;
import AIOShopBuyer.Utils.Gui;
import xobot.client.callback.listeners.PaintListener;
import xobot.script.ActiveScript;
import xobot.script.Manifest;
import xobot.script.methods.tabs.Inventory;
import xobot.script.util.Time;
import xobot.script.util.Timer;

@Manifest(authors = { "IR0N" }, name = "AIOShopBuyer", version = 1.0, description = "Buys items from various shops.")

public final class AIOShopBuyer extends ActiveScript implements PaintListener {//}, MessageListener {

	public int area = -1;
	String status = "";

	private Timer t;

	public void MessageRecieved(String arg0, int arg1, String arg2) {

	}

	public boolean onStart() {
		Gui gui = new Gui();
		gui.setVisible(true);
		this.t = new Timer(System.currentTimeMillis());


        return true;

	}

	
	

	@Override
	public void repaint(Graphics g1) {
		// TODO Auto-generated method stub
		int boughtPerHour = (int) (Data.ITEMS_BOUGHT * 3600000.0D / this.t.getElapsed());
		
		g1.drawString("Time running " + this.t.toElapsedString(), 50, 85);
		g1.drawString("Items bought " + Data.ITEMS_BOUGHT, 50, 100);
		g1.drawString("Items(hr): " + NumberFormat.getNumberInstance(Locale.US).format(boughtPerHour), 50, 115);
		g1.drawString("Status - " + status, 50, 130);
		
	}

	@Override
	public int loop() {

		if (!Inventory.isFull() && !Buy.isAtShop() && Data.SHOP_ID == 6970) {
			status = "Going to Shop.";
			Teleport.teleportSummoning();
		}
		
		if (Buy.isAtShop()) {
			status = "At shop.";
			if (Buy.canBuy()) {
				status = "Buying items.";
				Buy.doBuy();
				Data.ITEMS_BOUGHT += 28;
			}
		}
		
		if (Inventory.isFull() && !Banking.isAtHome()) {

				status = "Teleporting home.";
				Teleport.teleportHome();

		}

		if (Banking.isAtHome()) {
			status = "At home.";
			if (Banking.canBank()){
				status = "Banking.";
				Banking.doBank();
			}
		}

		return 200;
	}

}
