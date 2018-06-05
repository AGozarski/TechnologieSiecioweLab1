<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 05.06.2018
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Shop</title>
  </head>
  <body>
  <h1><div style="text-align: center;">My Shop</div></h1>
  <h2>Products : </h2>
  <form method="post" action="summary">
      <input type="text" name="product1" placeholder="Product1" ><input type="text" name="price1" placeholder="Price" ><br>
      <input type="text" name="product2" placeholder="Product2"><input type="text" name="price2" placeholder="Price"><br>
      <input type="text" name="product3" placeholder="Product3"><input type="text" name="price3" placeholder="Price"><br>
      <input type="text" name="product4" placeholder="Product4"><input type="text" name="price4" placeholder="Price"><br>
      <input type="text" name="product5" placeholder="Product5"><input type="text" name="price5" placeholder="Price"><br>
      <input type="text" name="product6" placeholder="Product6"><input type="text" name="price6" placeholder="Price"><br>
      <input type="text" name="product7" placeholder="Product7"><input type="text" name="price7" placeholder="Price"><br>
      <input type="submit" value="Add up and buy">
  </form>
  </body>
</html>
