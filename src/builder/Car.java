package builder;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(CarBuilder builder){
        this.make = builder.make;
        this.year = builder.year;
        this.model = builder.model;
    }

    //Creating inner CarBuilder class

    public static class CarBuilder {
        private String make;
        private String model;
        private int year;

        public CarBuilder(){}

        public CarBuilder make(String make){
            this.make = make;
            return this;
        }
        public CarBuilder year(int year){
            this.year = year;
            return this;
        }

        public CarBuilder model(String model){
            this.model = model;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    // Getters and setters for car class

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
