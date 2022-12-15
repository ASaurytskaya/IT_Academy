package additional.test1512.task_2;

import java.util.ArrayList;

public class Check {
    private ArrayList<String> productsInCheck;
    private double sumTotal;

    public Check() {
        this.productsInCheck = new ArrayList<>();
        this.sumTotal = 0;
    }

    public void addToCheck(String productInTheBasket) {
        productsInCheck.add(productInTheBasket);
    }

    public ArrayList<String> getProductsInCheck() {
        return productsInCheck;
    }

    public void addToSum(double price) {
        sumTotal += price;
    }

    public double getTotalCost() {
        return sumTotal;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < productsInCheck.size(); i++) {
            result.append(i + 1).append(". ").append(productsInCheck.get(i)).append("\n");
        }
        result.append("Итого надо заплатить: ").append(sumTotal);
        return result.toString();
    }
}
