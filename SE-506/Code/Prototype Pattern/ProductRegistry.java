import java.util.HashMap;
import java.util.Map;

class ProductRegistry {
    private Map<String, Product> registry = new HashMap<>();

    public void addProduct(String key, Product product) {
        registry.put(key, product);
    }

    public Product getProduct(String key) {
        return registry.get(key).clone();
    }
}