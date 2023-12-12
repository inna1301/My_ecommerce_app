package com.example.my_ecommerce_app.global;

import com.example.my_ecommerce_app.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}

