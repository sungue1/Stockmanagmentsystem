package stock;

import java.util.Scanner;

public interface StockInput {

	public void getUserInput(Scanner input);

	public String getTicker();
	
	public double getBuyprice();

	public void setBuyprice(int buyprice) throws Exception;
	
	public int getPurchases();

	public void setPurchases(int purchases);
	
	public double getDividend();

	public void setDividend(double dividend);

	public void printInfo();
	
	public void setStockTicker(Scanner input);

	public void setStockBuyprice(Scanner input);

	public void setStockPurchases(Scanner input);

	public void setStockDividend(Scanner input);

}
