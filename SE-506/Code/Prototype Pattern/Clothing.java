// Clothing Product
class Clothing implements Product {
    private String name;
    private String category;
    private double price;
    private String color;
    private String size;

    public Clothing(String name, String category, double price, String color, String size) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Clothing(name, category, price, color, size);
    }

    @Override
    public String toString() {
        return "Clothing [name=" + name + ", category=" + category + ", price=" + price + ", color=" + color + ", size=" + size + "]";
    }
}

