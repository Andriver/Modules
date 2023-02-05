package module8.graphics_editor;

public class Quad extends Shape {

    public String name = "Quad";

    @Override
    public String getName() {
        return name;
    }

    @Override
    void common() {
        System.out.println(name);
    }
}
