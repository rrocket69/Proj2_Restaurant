package services;

import entities.Recipes;
import model.Order;
import sqlconnect.DBConnection;

public class DishInputter {
    Order order;

    public DishInputter(Order order) {
        this.order = order;
    }

    public void insert(int[] dishes) {
        for (int i = 0; i < dishes[0]; i++) {
            if (checkEnough(Recipes.FourCheeses))
                order.addDish("FourCheeses");
            else
                order.addUnable("FourCheeses");
        }
        for (int i = 0; i < dishes[1]; i++)
            if (checkEnough(Recipes.Classical))
                order.addDish("Classical");
            else
                order.addUnable("Classical");
        for (int i = 0; i < dishes[2]; i++)
            if (checkEnough(Recipes.Margarita))
                order.addDish("Margarita");
            else
                order.addUnable("Margarita");
    }

    public boolean checkEnough(Recipes recipe) {
        return DBConnection
                .getInstance()
                .getRecordsFromDB(recipe.getRecipesMap());
    }
//    public Map<Ingridient, Integer> checkEnough(Recipes recipe) {
//        return DBConnection
//                .getInstance()
//                .getRecordsFromDB(recipe.getRecipesMap());
//    }
}
