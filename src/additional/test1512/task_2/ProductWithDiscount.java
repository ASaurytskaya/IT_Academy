package additional.test1512.task_2;


import additional.test1512.task_2.api.IProduct;

public class ProductWithDiscount implements IProduct {
    private String name;
    private double price;
    private double discount;

    public ProductWithDiscount(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
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
        return discount;
    }

    public String toString() {
        return String.format("%s, Цена - %s, Скидка - %s%%", this.name, String.valueOf(this.price),
                String.valueOf(this.discount));
    }
}
