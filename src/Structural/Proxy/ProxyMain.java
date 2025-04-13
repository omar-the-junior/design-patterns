package Structural.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        // Using the proxy
        Image image = new ProxyImage("high_resolution_photo.jpg");

        // Image will be loaded from disk for the first time
        System.out.println("\nFirst time displaying the image:");
        image.display();

        // Image will be loaded from cache
        System.out.println("\nSecond time displaying the image:");
        image.display();
    }
}