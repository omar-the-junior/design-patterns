package Structural.Proxy;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("(Proxy) First time loading image...");
            realImage = new RealImage(filename);
        } else {
            System.out.println("(Proxy) Loading from cache...");
        }
        realImage.display();
    }
}