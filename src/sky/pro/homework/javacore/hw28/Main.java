package sky.pro.homework.javacore.hw28;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        Product bananas = new Product("Бананы", 100, 1);
        Product tomate = new Product("Томаты", 500, 2);

        basket.addProduct(bananas);
        basket.addProduct(tomate);
        basket.deleteProduct(tomate);
        basket.addProduct(tomate);

        Recipe recipe = new Recipe("Пицца", basket.getProductSet());

        System.out.println(recipe.getRecipePrice());

    }
}
