package sky.pro.homework.javacore.hw28;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Product, Integer> productMap = new HashMap<>();

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    public void addProduct(Product product, Integer amount) {
        if (productMap.containsKey(product)) {
            throw new RuntimeException("Продукт уже есть в корзине!");
        }
        if (amount <= 0){
            throw new IllegalArgumentException("Кол-во продуктов не может быть 0!");
        }
        productMap.put(product, amount);
    }

    public void deleteProduct(Product product) {
        if (!productMap.containsKey(product)) {
            throw new RuntimeException("Продукта нет в корзине, нет возможности его удалить.");
        }
        productMap.remove(product);
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
}
