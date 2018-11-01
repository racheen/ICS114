<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>

<jsp:useBean id="calculator" type="java.sql.ResultSet" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
        <h1 align="center">Calculator</h1>
        <table align="center" border="1" cellpadding="2" cellspacing="2">
                <tr>
                        <th>ID</th>
                        <th>Operand1</th>
                        <th>Operator</th>
                        <th>Operand2</th>
                        <th>Results</th>
                        <th>Notes</th>
                </tr>
                <% while (calculator.next()) { %>
                <tr align="center">
                        <td></td>
                        <td><%=calculator.getFloat("operand1") %></td>
                        <td><%=calculator.getString("operator") %></td>
                        <td><%=calculator.getFloat("operand2") %></td>
                        <td><%=calculator.getFloat("results") %></td>
                        <td><%=calculator.getString("notes") %></td>
                </tr>
                <% } %>
        </table>
                
        <p align="center">
                Click <a href="index.html">here</a> to go back
        </p>
</body>
</html>
