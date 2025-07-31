package com.voltrex.spring_boot.service;

import com.voltrex.spring_boot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
        new Product(101,"Iphone",60000),
        new Product(102,"Ipad",34000),
        new Product(103,"Macbook",80000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prod){
//        return products.stream()
//                .filter(p -> p.getProdId() == prod)
//                .findFirst().get();
            return products.stream()
                .filter(p -> p.getProdId() == prod)
                .findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProducts(Product prod){
        products.add(prod);
    }
}
