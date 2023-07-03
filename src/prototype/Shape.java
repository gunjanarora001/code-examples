package prototype;

public abstract class Shape implements Cloneable {
    protected String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}