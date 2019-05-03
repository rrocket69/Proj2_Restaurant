<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h2>Make your order</h2>

<form method="post">
    <label>Name:
        <input type="text" name="name" value="User"><br/>
    </label>
    <label>Amount of Four Cheeses:
        <input type="number" name="fourCheeses" value=0><br/>
    </label>
    <label>Amount of Classical:
        <input type="number" name="classical" value=0><br/>
    </label>
    <label>Amount of Margaritas:
        <input type="number" name="margarita" value=0><br/>
    </label>
    <button type="submit">Submit</button>
</form>
<%
    if (request.getAttribute("name") != null) {
        out.println("<p>Thank you for your order, " + request.getAttribute("name") + "!</p>");
    }
    List<String> missing = (List<String>) request.getAttribute("missing");
    if(missing!=null && !missing.isEmpty()){
            out.println("<ui>Not enough ingridients for");
            for (String s : missing) {
                out.println("<li>" + s + "</li>");
            }
            out.println("</ui>");
    }
%>
<button onclick="location.href='/info'">check order</button>
</body>
</html>
