package servlets;

import model.Order;
import services.DishInputter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/main.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Order order = Order.getInstance();
        order.setName(req.getParameter("name"));
        int[] dishes = {
                Integer.parseInt(req.getParameter("fourCheeses")),
                Integer.parseInt(req.getParameter("classical")),
                Integer.parseInt(req.getParameter("margarita"))
        };
        req.setAttribute("missing",Order.getInstance().getListUnable());
        new DishInputter(order).insert(dishes);
        doGet(req, resp);
    }
}
