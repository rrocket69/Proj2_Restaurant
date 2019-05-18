package model.services;

import model.entities.enums.Ingridient;
import model.entities.order.Order;

public class GetOrder {
    public int getAmountDough() {
        return Order.getInstance().getListDishes().stream()
                .mapToInt(e -> e.getRecipe().getComposition().get((Ingridient.Dough)))
                .sum();
    }
}
