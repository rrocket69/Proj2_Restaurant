package controller.command;

import model.entities.enums.Recipes;
import model.entities.order.Order;
import model.services.InputOrder;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddOrderCommand implements Command {

    public String execute(HttpServletRequest req) {
        Order order = Order.getInstance();
        Map<Recipes, Integer> mapDishes = new HashMap<>();

        order.setName(req.getParameter("name"));
        Arrays.stream(Recipes.values())
                .forEach(e -> mapDishes.put(e, Integer.parseInt(req.getParameter(e.toString()))));

        InputOrder.insert(mapDishes);

        return "";
    }
}
