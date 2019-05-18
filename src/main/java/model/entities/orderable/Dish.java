package model.entities.orderable;

import model.entities.enums.Recipes;

public class Dish implements Orderable {
    private Recipes recipe;
    private boolean enoughIngridients;

    public Recipes getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipes recipe) {
        this.recipe = recipe;
    }

    public boolean getAvailable() {
        return enoughIngridients;
    }

    public void setAvailable(boolean enoughIngridients) {
        this.enoughIngridients = enoughIngridients;
    }
}
