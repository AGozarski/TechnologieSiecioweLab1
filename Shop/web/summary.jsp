<%@ page import="adam.g.model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 05.06.2018
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Product> productList = (List<Product>) request.getAttribute("products");
%>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <title>Summary</title>
</head>
<body>
<h1>Summary of your shopcart</h1>
<h2>Purchased products</h2>
<table class="table table-bordered" style="width: 600px">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
        <%
        for (int i = 0; i< productList.size(); i++){
    %>
    <tr>
        <td><%=i+1%></td> <td><%=productList.get(i).getName()%></td> <td><%=productList.get(i).getPrice()%></td>
    </tr>
            <%
    }
%>
    </tbody>
</table>
<h2>Total price: <%=request.getAttribute("totalPrice")%></h2>
<h2>Average price: <%=request.getAttribute("averagePrice")%></h2>
</body>
</html>
