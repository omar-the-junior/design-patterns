package Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        // Create original shapes
        Circle originalCircle = new Circle(10, "Red");
        Rectangle originalRectangle = new Rectangle(20, 30, "Blue");

        // Clone the shapes
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // Print information about original and cloned shapes
        System.out.println("Original shapes:");
        System.out.println(originalCircle.getInfo());
        System.out.println(originalRectangle.getInfo());

        System.out.println("\nCloned shapes:");
        System.out.println(clonedCircle.getInfo());
        System.out.println(clonedRectangle.getInfo());
    }
}