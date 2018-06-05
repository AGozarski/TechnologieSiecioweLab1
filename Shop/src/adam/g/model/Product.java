package adam.g.model;

import java.util.List;

public class Product {

    private String name;
    private Double price;

    public Product(String name, String price){
        if(!(name.isEmpty())&& !(price.isEmpty())){
            price.replace(',','.');
            this.name = name;
            this.price = Double.valueOf(price);
        }
    }
    public static void addToShopCart (List<Product> productList, String name , String price){
        if(!(name.isEmpty())&& !(price.isEmpty())){
            price.replace(',','.');
            productList.add(new Product(name,price));
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
