package Creational.Prototype;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public String getInfo() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}