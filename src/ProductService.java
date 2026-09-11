import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        // TODO: Implement duplicate-ID validation and add product.
    }

    public void displayProducts() {
        // TODO: Display all products.
    }

    public ArrayList<Product> searchByName(String keyword) {
        // TODO: Implement name search.
        return new ArrayList<>();
    }

    public ArrayList<Product> searchByCategory(String category) {
        // TODO: Implement category search.
        return new ArrayList<>();
    }

    public Product findById(String id) {
        // TODO: Find product by ID.
        return null;
    }

    public boolean updateStock(String productId, int quantity) {
        // TODO: Safely update stock.
        return false;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
