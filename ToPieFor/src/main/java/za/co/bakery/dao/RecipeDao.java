package za.co.bakery.dao;

import java.util.List;
import za.co.bakery.model.Recipe;

public interface RecipeDao {

    public List<Recipe> getAllRecipes();

    public Recipe getRecipeByName(String recipeName);

    public Recipe getRecipeById(int recipeId);

    public List<String> getRecipeIngredients(int recipeId);

    public boolean addRecipeIngredient(Recipe recipe);

    public boolean addRecipe(Recipe recipe);

    public boolean activateRecipe(Recipe recipe);

    public boolean editRecipe(Recipe recipe);
}
