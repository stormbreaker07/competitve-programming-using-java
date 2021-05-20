package main;

import config.ProductConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import beans.*;


public class Main   {

    public static void main(String[] args ) {

        try(
                var context = new AnnotationConfigApplicationContext(ProductConfig.class) )
        {
            Cat x = context.getBean(Cat.class);
            Owner y = context.getBean(Owner.class);

            x.setCatName("joe jonas");
            System.out.println(x.getCatName());
            System.out.println(y);
        }
    }
}
