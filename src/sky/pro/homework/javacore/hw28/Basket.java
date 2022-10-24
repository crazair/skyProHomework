package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Set;

public class Basket {

    private Set<Product> productSet = new HashSet<>();

    public void addProduct(Product product){
        if (productSet.contains(product)){
            throw new RuntimeException("Продукт уже есть в корзине!");
        }
        productSet.add(product);
    }

    public void deleteProduct(Product product){
        if (!productSet.contains(product)){
            throw new RuntimeException("Продукта нет в корзине, нет возможности его удалить.");
        }
        productSet.remove(product);
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
