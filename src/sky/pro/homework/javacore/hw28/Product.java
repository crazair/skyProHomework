package sky.pro.homework.javacore.hw28;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Поле name пусто. Заполните карточку товара полностью!");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("Поле price пусто. Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    public void setAmount(int amount) {
        if (amount <= 0){
            throw new IllegalArgumentException("Поле amount пусто. Заполните карточку товара полностью!");
        }
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }
}
