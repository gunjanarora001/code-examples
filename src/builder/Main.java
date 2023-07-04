package builder;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car.CarBuilder().make("benz").build();
        System.out.println(myCar.getMake());
    }
}
