package services;

import util.Ingridient;
import util.Recipes;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight pattern
 */
public class RecipesFlyweightFactory {
    private static Map<String, Map<Ingridient, Integer>> recipesMap = new HashMap<>();

    public static Map<Ingridient, Integer> getComposition(String dishName) {
        Map<Ingridient, Integer> temp = recipesMap.get(dishName);
        if (temp == null) {
            temp = new HashMap<>();
            switch (dishName) {
                case Recipes.FourCheeses:
                    temp.put(Ingridient.Dough, 1);
                    temp.put(Ingridient.TomatoSauce, 1);
                    temp.put(Ingridient.Parmezan, 2);
                    temp.put(Ingridient.Gauda, 1);
                    temp.put(Ingridient.Mozarella, 2);
                    temp.put(Ingridient.Rokfor, 1);
                    break;
                case Recipes.Classical:
                    temp.put(Ingridient.Dough, 1);
                    temp.put(Ingridient.TomatoSauce, 1);
                    temp.put(Ingridient.Parmezan, 1);
                    temp.put(Ingridient.Mozarella, 1);
                    temp.put(Ingridient.Pepperoni, 1);
                    temp.put(Ingridient.Tomato, 1);
                    break;
                case Recipes.Margarita:
                    temp.put(Ingridient.Dough, 1);
                    temp.put(Ingridient.TomatoSauce, 1);
                    temp.put(Ingridient.Tomato, 1);
                    temp.put(Ingridient.Parmezan, 1);
                    temp.put(Ingridient.Mozarella, 1);
                    break;
            }
            recipesMap.put(dishName, temp);
        }
        return temp;
    }
}