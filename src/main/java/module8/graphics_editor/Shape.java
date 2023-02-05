package module8.graphics_editor;

public class Shape implements Drawable {

    public String name = "Shape";

    public String getName() {
        return name;
    }

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void common() {
        System.out.println(name);
    }
}
