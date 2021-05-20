package main;

import config.ProductConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProductConfig.class)) {
            ProductRepository productRepository = context.getBean(ProductRepository.class);

            Product product = context.getBean(Product.class);
//            product.setName("football");
//            product.setPrice(1200.00);
//            productRepository.addProduct(product);
            List<Product> list = productRepository.getProduct();
            for(Product x : list) {
                System.out.println(x);
            }
        }
    }
}
