package decorator;

public class MilkDecorator implements Beverage {
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }

    public String getDescription() {
        return "Milk";
    }
}