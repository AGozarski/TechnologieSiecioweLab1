package adam.g.controller;

import adam.g.businesslogic.PriceCalculator;
import adam.g.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/summary")
public class ShopController extends HttpServlet {
    String product1,product2,product3,product4,product5,product6,product7;
    String price1,price2,price3,price4,price5,price6,price7;
    PriceCalculator priceCalculator = new PriceCalculator();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> productList = new ArrayList<>();
        product1 = request.getParameter("product1");
        product2 = request.getParameter("product2");
        product3 = request.getParameter("product3");
        product4 = request.getParameter("product4");
        product5 = request.getParameter("product5");
        product6 = request.getParameter("product6");
        product7 = request.getParameter("product7");
        price1 = request.getParameter("price1").replace(',','.').trim();
        price2 = request.getParameter("price2").replace(',','.').trim();
        price3 = request.getParameter("price3").replace(',','.').trim();
        price4 = request.getParameter("price4").replace(',','.').trim();
        price5 = request.getParameter("price5").replace(',','.').trim();
        price6 = request.getParameter("price6").replace(',','.').trim();
        price7 = request.getParameter("price7").replace(',','.').trim();

        Product.addToShopCart(productList,product1,price1);
        Product.addToShopCart(productList,product2,price2);
        Product.addToShopCart(productList,product3,price3);
        Product.addToShopCart(productList,product4,price4);
        Product.addToShopCart(productList,product5,price5);
        Product.addToShopCart(productList,product6,price6);
        Product.addToShopCart(productList,product7,price7);

        if (!productList.isEmpty()){
            Double totalPrice = priceCalculator.totalPrice(productList);
            Double avergePrice = priceCalculator.averagePrice(productList);
            request.setAttribute("products", productList);
            request.setAttribute("totalPrice", totalPrice);
            request.setAttribute("averagePrice", avergePrice);
            request.getRequestDispatcher("summary.jsp").forward(request, response);
        }else{
            response.sendRedirect("empty.jsp");
        }
    }
}
