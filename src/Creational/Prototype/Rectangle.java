package Creational.Prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public String getInfo() {
        return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}