package additional.test1512.task_2;

import additional.test1512.task_2.api.IProduct;

public class ProductWithMarkdown implements IProduct {
    private String name;
    private double price;
    private double discount;
    private String markdownDescription;

    public ProductWithMarkdown(String name, double price, double discount, String markdownDescription) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.markdownDescription = markdownDescription;
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

    public String getMarkdownDescription() {
        return markdownDescription;
    }

    public String toString() {
         return String.format("%s, Цена - %s, Скидка - %s%%, Уценка - %s", this.name, String.valueOf(this.price),
                 String.valueOf(this.discount), markdownDescription);
    }
}
