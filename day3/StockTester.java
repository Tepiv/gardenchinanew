package day3;
public class StockTester {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);
        System.out.println(s.getChangePercent());
    }
}