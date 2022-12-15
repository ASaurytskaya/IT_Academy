package additional.test1512.task_2;

import additional.test1512.task_2.api.IProduct;

public class Product implements IProduct {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    public String toString() {
        return String.format("%s, Цена - %s", this.name, String.valueOf(this.price));
    }
}
