package com.example.my_ecommerce_app.controller;

import com.example.my_ecommerce_app.global.GlobalData;
import com.example.my_ecommerce_app.service.CategoryService;
import com.example.my_ecommerce_app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping({"/", "/home"})
    private String home(Model model) {
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "index";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shopByCategory(@PathVariable Integer id, Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "viewProduct";
    }

}

