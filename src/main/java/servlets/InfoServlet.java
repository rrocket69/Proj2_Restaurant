package servlets;

import model.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = Order.getInstance();

        req.setAttribute("nameDishes",order.getListDishes());
        req.setAttribute("name",order.getName());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/info.jsp");
        requestDispatcher.forward(req, resp);
    }
}
