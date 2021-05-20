package config;

//import beans.*;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "beans")
public class ProductConfig {

//    @Bean
//    public Cat cat() {
//        Cat cat = new Cat();
//        cat.setCatName("Tom");
//        return cat;
//    }
//
//    @Bean
//    public Owner owner() {
//        Owner owner = new Owner();
//        owner.setCat(cat());
//        return owner;
//    }
}

