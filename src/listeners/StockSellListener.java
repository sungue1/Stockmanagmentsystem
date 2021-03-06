package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.StockManager;
import stock.ITStock;
import stock.Stock;
import stock.StockInput;
import stock.StockSector;

public class StockSellListener implements ActionListener {

	JTextField fieldTicker;
	JTextField fieldPurchases;
	StockManager stockManager;

	public StockSellListener(JTextField fieldTicker, StockManager stockManager) {
		this.fieldTicker = fieldTicker;
		this.stockManager = stockManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		stockManager.SellStock(fieldTicker.getText());
		putObject(stockManager, "stockmanager.ser");
	}

	public static void putObject(StockManager stockManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(stockManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
