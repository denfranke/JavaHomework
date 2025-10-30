package Other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 implements Basket {
    private Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (product == null || quantity <= 0)
            return;
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (product == null || quantity < 0) return;
        if (quantity == 0)
            products.remove(product);
        else
            products.put(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }

    public static void main(String[] args) {
        Test4 bask = new Test4();

        bask.addProduct("яблоко", 3);
        bask.addProduct("банан", 2);
        bask.updateProductQuantity("яблоко", 5);
        bask.removeProduct("банан");
        System.out.println("Продукты: " + bask.getProducts());
        System.out.println("кол-во яблок: " + bask.getProductQuantity("яблоко"));
        bask.clear();
        System.out.println("корзина после очистки: " + bask.getProducts());
    }
}
