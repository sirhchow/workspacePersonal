package stock;

public class Stock {

	private String symbol;
	private int totalShares;
	private double totalCost;
	
	public Stock(String theSymbol) {
		if (theSymbol == null) {
			throw new NullPointerException();
		}
		
		symbol = theSymbol;
		totalShares = 0;
		totalCost = 0;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getTotalShares() {
		return totalShares;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public double getProfit(double currentPrice) {
		if (currentPrice < 0) {
			throw new IllegalArgumentException();
		}
		
		return totalShares * currentPrice - totalCost;
	}
	
	public void purchase(int shares, double pricePerShare) {
		if (shares < 0 || pricePerShare < 0) {
			throw new IllegalArgumentException();
		}
		
		totalShares += shares;
		totalCost += shares * pricePerShare;
	}
	
	public void clear() {
		totalShares = 0;
		totalCost = 0;
	}
}
