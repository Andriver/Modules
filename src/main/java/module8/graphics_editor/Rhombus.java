package module8.graphics_editor;

public class Rhombus extends Shape {

    public String name = "Rhombus";

    @Override
    public String getName() {
        return name;
    }

    @Override
    void common() {
        System.out.println(name);
    }
}
