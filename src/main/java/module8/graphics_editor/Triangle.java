package module8.graphics_editor;

public class Triangle extends Shape {

    public String name = "Triangle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    void common() {
        System.out.println(name);
    }
}
