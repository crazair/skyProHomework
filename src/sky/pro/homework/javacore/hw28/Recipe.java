package sky.pro.homework.javacore.hw28;

import java.util.*;

public class Recipe {

    private String recipeName;
    private Map<Product, Integer> productMap = new HashMap<>();
    private double recipePrice;

    public Recipe(String recipeName, Map<Product, Integer> productMap) {
        this.recipeName = recipeName;
        this.productMap = productMap;

        for (Map.Entry<Product, Integer> entry: productMap.entrySet()){
            recipePrice += entry.getValue() * entry.getKey().getPrice();
        }
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public double getRecipePrice() {
        return recipePrice;
    }

    public void setRecipePrice(double recipePrice) {
        this.recipePrice = recipePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.recipePrice, recipePrice) == 0 && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(productMap, recipe.productMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, productMap, recipePrice);
    }
}
