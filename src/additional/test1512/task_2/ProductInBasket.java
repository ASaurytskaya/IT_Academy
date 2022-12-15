package additional.test1512.task_2;

import additional.test1512.task_2.api.IProduct;

public class ProductInBasket {
    private IProduct product;
    private double quantity;

    public ProductInBasket(IProduct product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public IProduct getProduct() {
        return product;
    }
}
