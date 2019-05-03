package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final Order instance = new Order();

    private String name;
    private List<String> listDishes = new ArrayList<>();
    private List<String> listUnable = new ArrayList<>();

    public static Order getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListDishes() {
        return listDishes;
    }

    public void addDish(String nameDish) {
        listDishes.add(nameDish);
    }

    public List<String> getListUnable() {
        return listUnable;
    }

    public void addUnable(String nameDish) {
        listUnable.add(nameDish);
    }
}
