package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    @Qualifier("es")
    public HelloService helloService;

    public void sayHello(String name) {
        String msg = helloService.sayHello(name);
        System.out.println(msg);
    }
}
