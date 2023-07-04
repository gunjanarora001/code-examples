package builder;


// you basically dont need this class since you can make it an inner class
public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car("", "", 0);
    }

    public void setMake(String make) {
        car.setMake(make);
    }

    public void setModel(String model) {
        car.setModel(model);
    }

    public void setYear(int year) {
        car.setYear(year);
    }

    public Car build() {
        return car;
    }
}