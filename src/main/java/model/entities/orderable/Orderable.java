package model.entities.orderable;

import model.entities.enums.Recipes;

public interface Orderable {
    public Recipes getRecipe();
    public boolean getAvailable();
}
