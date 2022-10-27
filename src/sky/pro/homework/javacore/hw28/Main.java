package sky.pro.homework.javacore.hw28;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        Product bananas = new Product("Бананы", 100);
        Product tomate = new Product("Томаты", 500);

        basket.addProduct(bananas, 5);
        basket.addProduct(tomate);
        basket.deleteProduct(tomate);
        basket.addProduct(tomate, 3);

        Recipe recipe = new Recipe("Пицца", basket.getProductMap());

        System.out.println(recipe.getRecipePrice());
    }
}
