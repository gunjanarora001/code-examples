package prototype;

public class Circle extends Shape {
    public Circle() {
        setType("Circle");
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}