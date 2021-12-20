package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }


    @RequestMapping(path = "/showProduct", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> showProducts(Model uiModel) {
        return productsService.getProducts();
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        return productsService.getProductById(id);
    }

    @RequestMapping(path = "/showProductById/{sid}", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(@PathVariable("sid") int id) {
        return productsService.getProductById(id);
    }

    @RequestMapping("/addProductForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "products-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        //productsService.addProduct(product);
        return "product-form-result";
    }
}
