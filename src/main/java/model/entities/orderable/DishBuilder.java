package model.entities.orderable;

import model.entities.enums.Recipes;

public class DishBuilder {
    private Dish newDish;
    public DishBuilder(){
        newDish = new Dish();
    }
    public DishBuilder setRecipe(Recipes recipe){
        newDish.setRecipe(recipe);
        return this;
    }
    public DishBuilder setAvailable(){
        newDish.setAvailable(checkEnough());
        return this;
    }

    public Dish build(){
        return newDish;
    }

    private boolean checkEnough() {
        return newDish.getRecipe().getComposition().entrySet().stream()
                .noneMatch(e -> e.getValue() > e.getKey().getAmount());
    }
}
