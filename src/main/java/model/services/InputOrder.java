package model.services;

import model.entities.enums.Recipes;
import model.entities.order.Order;
import model.entities.orderable.DishBuilder;

import java.util.Map;
import java.util.stream.IntStream;

public class InputOrder {
    public static void insert(Map<Recipes, Integer> map) {
        map.forEach((key, value) -> IntStream.range(0, value)
                .forEach((a) -> Order.getInstance()
                        .addDish(new DishBuilder()
                                .setRecipe(key)
                                .setAvailable()
                                .build())));
    }
}
