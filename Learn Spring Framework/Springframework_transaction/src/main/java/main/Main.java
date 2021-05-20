package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;
import service.ProductService;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService service = context.getBean(ProductService.class);
            ProductRepository rp = context.getBean(ProductRepository.class);
            service.ProductData("tanuj yadav");
        }
    }
}
