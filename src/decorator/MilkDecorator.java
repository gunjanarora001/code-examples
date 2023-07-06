package decorator;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}