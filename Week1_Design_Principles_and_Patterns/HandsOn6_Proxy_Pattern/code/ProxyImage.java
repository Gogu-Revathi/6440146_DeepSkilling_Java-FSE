import java.util.HashMap;

public class ProxyImage implements Image {
    private static HashMap<String, RealImage> cache = new HashMap<>();
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        RealImage realImage = cache.get(filename);

        if (realImage == null) {
            realImage = new RealImage(filename);
            cache.put(filename, realImage);
        }

        realImage.display();
    }
}
