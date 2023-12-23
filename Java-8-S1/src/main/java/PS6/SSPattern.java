package PS6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Stock {
    private String symbol;
    private double price;
    private double units;

    public Stock(String symbol, double price, double units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public double getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "Stock [symbol=" + symbol + ", price=" + price + ", units=" + units + "]";
    }
}

class StockFilters {
    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p) {
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (p.test(stock)) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }
}

public class SSPattern {
    public static void main(String[] args) {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", 318.65, 10.0));
        stocks.add(new Stock("MSFT", 166.86, 45.0));
        stocks.add(new Stock("Google", 99.0, 12.5));
        stocks.add(new Stock("AMZ", 1866.74, 45.0));
        stocks.add(new Stock("GOOGL", 1480.2, 3.5));
        stocks.add(new Stock("AAPL", 318.65, 8.8));
        stocks.add(new Stock("AMZ", 1866.74, 9.0));

        // 1. Print all the stocks details using forEach and Method Reference
        System.out.println("Print all the Stock Details--");
        stocks.forEach(System.out::println);

        // 2. Print all the stocks details whose symbol is AMZ
        System.out.println("\n-Symbol is equals to AMZ--");
        Predicate<Stock> symbolFilter = stock -> stock.getSymbol().equals("AMZ");
        List<Stock> amzStocks = StockFilters.filter(stocks, symbolFilter);
        amzStocks.forEach(System.out::println);

        // 3. Print all the stocks details whose price is above 300
        System.out.println("\n-Price is above 300-");
        Predicate<Stock> priceFilter = stock -> stock.getPrice() > 300;
        List<Stock> highPriceStocks = StockFilters.filter(stocks, priceFilter);
        highPriceStocks.forEach(System.out::println);
    }
}
