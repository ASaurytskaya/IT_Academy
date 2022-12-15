package additional.test1512.task_2;

import additional.test1512.task_2.api.IProduct;

import java.util.LinkedList;

public class Basket {
    private LinkedList<ProductInBasket> productsToBuy;

    public Basket() {
        this.productsToBuy = new LinkedList<>();
    }

    public void addProduct(IProduct product, double quantity) {
        productsToBuy.add(new ProductInBasket(product, quantity));
    }

    public LinkedList<ProductInBasket> getProductsToBuy() {
        return new LinkedList<>(this.productsToBuy);
    }
}
