<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<h2>Thank you for your order!</h2>
<%
    List<String> nameDishes = (List<String>) request.getAttribute("nameDishes");
    String name = (String) request.getAttribute("name");
    if (name != null) {
        out.print("<label>" + name + "</label>");
    }

    if (nameDishes != null && !nameDishes.isEmpty()) {
        out.println("<ui>");
        for (String s : nameDishes) {
            out.println("<li>" + s + "</li>");
        }
        out.println("</ui>");
    } else out.println("<p>No order!</p>");
%>
<button onclick="location.href='..'">continue order</button>
</body>
</html>
