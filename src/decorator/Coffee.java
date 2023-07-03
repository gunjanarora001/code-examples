package decorator;

public class Coffee implements Beverage {
    public double cost() {
        return 2.0;
    }

    public String getDescription() {
        return "decorator.Coffee";
    }
}