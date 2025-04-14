package Creational.Prototype;

class ShallowShape implements Shape {
    private Point center;
    private String color;

    public ShallowShape(Point center, String color) {
        this.center = center;
        this.color = color;
    }

    @Override
    public Shape clone() {
        // Shallow copy - both objects will share the same Point reference
        return new ShallowShape(this.center, this.color);
    }

    public void moveX(int dx) {
        center.setX(center.getX() + dx);
    }

    @Override
    public String getInfo() {
        return "ShallowShape [center=" + center + ", color=" + color + "]";
    }
}

class DeepShape implements Shape {
    private Point center;
    private String color;

    public DeepShape(Point center, String color) {
        this.center = center;
        this.color = color;
    }

    @Override
    public Shape clone() {
        // Deep copy - creates a new Point object
        return new DeepShape(new Point(this.center.getX(), this.center.getY()), this.color);
    }

    public void moveX(int dx) {
        center.setX(center.getX() + dx);
    }

    @Override
    public String getInfo() {
        return "DeepShape [center=" + center + ", color=" + color + "]";
    }
}

public class ComplexShapeDemo {
    public static void main(String[] args) {
        // Demonstrate Shallow Copy
        System.out.println("Shallow Copy Demonstration:");
        Point point1 = new Point(0, 0);
        ShallowShape originalShallow = new ShallowShape(point1, "Red");
        Shape clonedShallow = originalShallow.clone();

        System.out.println("Before moving original:");
        System.out.println("Original: " + originalShallow.getInfo());
        System.out.println("Clone: " + clonedShallow.getInfo());

        // Move the original shape
        ((ShallowShape) originalShallow).moveX(5);

        System.out.println("\nAfter moving original:");
        System.out.println("Original: " + originalShallow.getInfo());
        System.out.println("Clone: " + clonedShallow.getInfo()); // Clone's position also changes!

        // Demonstrate Deep Copy
        System.out.println("\nDeep Copy Demonstration:");
        Point point2 = new Point(0, 0);
        DeepShape originalDeep = new DeepShape(point2, "Blue");
        Shape clonedDeep = originalDeep.clone();

        System.out.println("Before moving original:");
        System.out.println("Original: " + originalDeep.getInfo());
        System.out.println("Clone: " + clonedDeep.getInfo());

        // Move the original shape
        ((DeepShape) originalDeep).moveX(5);

        System.out.println("\nAfter moving original:");
        System.out.println("Original: " + originalDeep.getInfo());
        System.out.println("Clone: " + clonedDeep.getInfo()); // Clone's position remains unchanged!
    }
}