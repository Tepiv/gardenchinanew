package day3;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.name = name;
        this.symbol = symbol;
        


    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }
    public void setPreviousClosingPrice (double prevClosingPrice) {
        this.previousClosingPrice = prevClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}