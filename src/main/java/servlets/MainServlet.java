package servlets;

import util.Recipes;
import model.Order;
import services.DishInputter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/main.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = Order.getInstance();
        Map<String, Integer> mapDishes = new HashMap<>();

        order.setName(req.getParameter("name"));
        mapDishes.put(Recipes.FourCheeses, Integer.parseInt(req.getParameter(Recipes.FourCheeses)));
        mapDishes.put(Recipes.Classical, Integer.parseInt(req.getParameter(Recipes.Classical)));
        mapDishes.put(Recipes.Margarita, Integer.parseInt(req.getParameter(Recipes.Margarita)));
        order.getListUnable().clear();
        DishInputter.insert(mapDishes);

        req.setAttribute("missing", order.getListUnable());
        doGet(req, resp);
    }
}
