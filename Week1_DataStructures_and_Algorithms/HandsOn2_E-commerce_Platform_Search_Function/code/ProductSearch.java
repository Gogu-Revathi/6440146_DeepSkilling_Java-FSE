import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearch(Product[] products, String keyword) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(keyword)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String keyword) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = products[mid].getProductName();

            int comparison = midName.compareToIgnoreCase(keyword);

            if (comparison == 0)
                return products[mid];
            else if (comparison < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
