<%@ page import="model.entities.order.Order" %>
<%@ page import="model.entities.orderable.Orderable" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<h2>Thank you for your order!</h2>
<%
    Order order = (Order) request.getAttribute("order");
    if (order.getName() != null) {
        out.print("<label>" + order.getName() + "</label>");
    }

    if (order.getListDishes() != null && !order.getListDishes().isEmpty()) {
        out.println("<ui>");
        for (Orderable s : order.getListDishes()) {
            out.print("<li>"
                    + s.getRecipe()
                    + " - available: "
                    + s.getAvailable()
                    + "</li>");
        }
        out.println("</ui>");
    } else out.println("<p>No order!</p>");
    int dough = (int) request.getAttribute("dough");
    out.println("<p>Amount of Dough: " + dough + "</p>");
%>
<button onclick="location.href='/main'">continue order</button>
</body>
</html>
