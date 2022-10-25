package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {


    private String recipeName;
    private Set<Product> productSet = new HashSet<>();
    private double recipePrice;

    public Recipe(String recipeName, Set<Product> productSet) {
        this.recipeName = recipeName;
        this.productSet = productSet;

        recipePrice = productSet.stream()
                .mapToDouble(value -> value.getPrice())
                .sum();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
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
        return Double.compare(recipe.recipePrice, recipePrice) == 0 && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(productSet, recipe.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, productSet, recipePrice);
    }

}
