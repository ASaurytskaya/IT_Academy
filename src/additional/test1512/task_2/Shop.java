package additional.test1512.task_2;

import additional.test1512.task_2.api.IProduct;

import java.util.ArrayList;

public class Shop {
    private ArrayList<IProduct> allProducts = new ArrayList<>();

    public void addProduct(IProduct product) {
        allProducts.add(product);
    }

    public ArrayList<IProduct> getAllProducts() {
        return new ArrayList<>(allProducts);
    }

    public Basket getBasket() {
        return new Basket();
    }

    public Check getCheck(Basket basket) {
        Check check = new Check();
        for (ProductInBasket productInBasket : basket.getProductsToBuy()) {
            IProduct product = productInBasket.getProduct();
            double totalPrice = product.getPrice() * (1 - product.getDiscount()/100) * productInBasket.getQuantity();
            String productToCheck = product + ", Количество - " +
                    productInBasket.getQuantity() + ", Сумма - " + totalPrice;
            check.addToCheck(productToCheck);
            check.addToSum(totalPrice);
        }
        return check;
    }
}
