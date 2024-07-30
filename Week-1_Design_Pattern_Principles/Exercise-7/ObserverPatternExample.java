public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 150.00);
        System.out.println("");

        stockMarket.setStockPrice("GOOGL", 2800.00);
        System.out.println("");

        stockMarket.removeObserver(mobileApp2);
        stockMarket.setStockPrice("AMZN", 3400.00);
    }
}
