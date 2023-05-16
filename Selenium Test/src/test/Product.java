package test;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        if (this.price < otherProduct.price) {
            return -1;
        } else if (this.price > otherProduct.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
