package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape s = new Circle();
        Circle c = (Circle) s.clone();

        s.draw();
        c.draw();

    }
}
