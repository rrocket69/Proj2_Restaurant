package model.entities.order;

import model.entities.orderable.Dish;
import model.entities.orderable.Orderable;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final Order instance = new Order();

    private String name;
    private List<Orderable> listDishes = new ArrayList<>();

    public static Order getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Orderable> getListDishes() {
        return listDishes;
    }

    public void addDish(Dish dish) {
        listDishes.add(dish);
    }

}
