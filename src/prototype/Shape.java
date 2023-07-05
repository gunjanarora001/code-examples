package prototype;

public abstract class Shape implements Cloneable {
    protected String type;
    public Shape(){}

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void draw();

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape s = new Circle();
        return s;
    }
}