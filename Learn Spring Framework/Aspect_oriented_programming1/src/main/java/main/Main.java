package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloWorld;

public class Main {

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloWorld hi = context.getBean(HelloWorld.class);
            String message = hi.sayHello("jhonson");
            System.out.println(message);
        }
    }
}
