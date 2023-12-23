package PS7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Stock {
    private String symbol;
    private double price;
    private int units;

    public Stock(String symbol, double price, int units) {
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

    public int getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
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

public class StrategyPattern {
    public static void main(String[] args) {
     
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", 150.0, 100));
        stocks.add(new Stock("GOOGL", 2500.0, 50));
        stocks.add(new Stock("MSFT", 300.0, 75));

      
        List<Stock> filteredBySymbol = StockFilters.filter(stocks, stock -> stock.getSymbol().equals("AAPL"));
        System.out.println("Stocks filtered by symbol 'AAPL': " + filteredBySymbol);

        
        List<Stock> filteredByPrice = StockFilters.filter(stocks, stock -> stock.getPrice() > 200.0);
        System.out.println("Stocks filtered by price above 200.0: " + filteredByPrice);

        Burger baseBurger = new BaseBurger();
        System.out.println("Base Burger: " + baseBurger.getDescription());

        Burger veggieBurger = new VeggiesDecorator(baseBurger);
        System.out.println("Adding veggies to the burger");
        System.out.println("Base Burger: " + veggieBurger.getDescription());

        Burger veggieCheeseBurger = new CheeseDecorator(veggieBurger);
        System.out.println("Adding cheese to the burger");
        System.out.println("I get " + veggieCheeseBurger.getDescription());
    }
}

interface Burger {
    String getDescription();
}

class BaseBurger implements Burger {
    @Override
    public String getDescription() {
        return "burger";
    }
}

abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }
}

class VeggiesDecorator extends BurgerDecorator {
    public VeggiesDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Veggie";
    }
}

class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cheese";
    }
}
