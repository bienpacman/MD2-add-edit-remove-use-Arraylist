package com.company;

import java.util.ArrayList;

public class TestProduct {

    public static void main(String[] args) {
	// write your code here
Product product1 = new Product(1,"máy giặt",9500000);
Product product2 = new Product(2,"Điều hòa",6400000);
Product product3 = new Product(3,"Tủ lạnh",9000000);
Product product4 = new Product(4,"Ti vi",1200000);

        ArrayList<Product> productList = new ArrayList<>();
        ProductManager Pro = new ProductManager(productList);
        Pro.add(product1);
        Pro.add(product2);
        Pro.add(product3);
        Pro.add(product4);

        Pro.disPlayProduct();
        System.out.println("------- remove id ");
        Pro.remove(1);
        System.out.println("-------- edit id , name");
        Pro.editProduct(1,"máy giặt Dulix");
        Pro.disPlayProduct();
        System.out.println("-------Search");
        System.out.println(Pro.searchProduct("ti vi"));
        System.out.println("-----Sắp xếp theo giá");
        Pro.sort();
        Pro.disPlayProduct();
    }
}
