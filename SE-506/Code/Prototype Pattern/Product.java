interface Product extends Cloneable {
    String getName();
    String getCategory();
    double getPrice();
    void setPrice(double price);
    Product clone();
}