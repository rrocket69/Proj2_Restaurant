package services;

import model.Order;
import sqlconnect.DBConnection;

import java.util.Map;

public class DishInputter {

    public static void insert(Map<String, Integer> map) {
        //TODO: STREAM API
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++)
                commandToDo(entry.getKey());
        }
    }

    private static void commandToDo(String name) {
        //TODO: TRY CHAIN OF RESPONSIBILITY
        Order order = Order.getInstance();
        if (DBConnection
                .getInstance()
                .getRecordsFromDB(RecipesFlyweightFactory
                        .getComposition(name))) {
            order.addDish(name);
        } else {
            order.addUnable(name);
        }
    }
}
