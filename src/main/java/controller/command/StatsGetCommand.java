package controller.command;

import model.services.GetOrder;

import javax.servlet.http.HttpServletRequest;

public class StatsGetCommand implements Command {
    private GetOrder getOrder;

    public StatsGetCommand(GetOrder getOrder) {
        this.getOrder = getOrder;
    }

    @Override
    public String execute(HttpServletRequest req) {
        req.setAttribute("dough", getOrder.getAmountDough());
        return "";
    }
}
