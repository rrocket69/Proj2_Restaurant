package controller.servlets;

import controller.command.Command;
import controller.command.StatsGetCommand;
import model.entities.order.Order;
import model.services.GetOrder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InfoServlet extends HttpServlet {

    private Map<String, Command> commands = new HashMap<>();

    public void init() {
        commands.put("dough", new StatsGetCommand(new GetOrder()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("order", Order.getInstance());
        commands.get("dough").execute(req);
        req.getRequestDispatcher("pages/info.jsp").forward(req, resp);
    }
}
