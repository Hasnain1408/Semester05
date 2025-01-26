// Electronics Product
class Electronics implements Product {
    private String name;
    private String category;
    private double price;
    private String storageCapacity;
    private String batteryLife;

    public Electronics(String name, String category, double price, String storageCapacity, String batteryLife) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.storageCapacity = storageCapacity;
        this.batteryLife = batteryLife;
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
        return new Electronics(name, category, price, storageCapacity, batteryLife);
    }

    @Override
    public String toString() {
        return "Electronics [name=" + name + ", category=" + category + ", price=" + price + ", storageCapacity=" + storageCapacity + ", batteryLife=" + batteryLife + "]";
    }
}