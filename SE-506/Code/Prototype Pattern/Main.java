public class Main {
    public static void main(String[] args) {
        // Create prototype instances
        Product clothingPrototype = new Clothing("T-Shirt", "Clothing", 19.99, "Red", "M");
        Product electronicsPrototype = new Electronics("Smartphone", "Electronics", 499.99, "128GB", "24h");

        // Create registry and add prototypes
        ProductRegistry registry = new ProductRegistry();
        registry.addProduct("CLOTHING", clothingPrototype);
        registry.addProduct("ELECTRONICS", electronicsPrototype);

        // Create new products using prototypes
        Product redShirt = registry.getProduct("CLOTHING");
        Product smartphone = registry.getProduct("ELECTRONICS");

        // Customize products
        redShirt.setPrice(24.99);
        smartphone.setPrice(549.99);

        System.out.println();

        // Display products
        System.out.println(redShirt);
        System.out.println(smartphone);
    }
}