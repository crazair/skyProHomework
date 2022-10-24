package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Set;

public class RecipeBook {

    private Set<Recipe> recipeSet = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        for (Recipe r : recipeSet) {
            if(r.getRecipeName().equals(recipe.getRecipeName())){
                throw new RuntimeException("Рецепт уже есть в книге!");
            }
        }
        recipeSet.add(recipe);
    }

}
