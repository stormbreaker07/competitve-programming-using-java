package services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {

    public String hello;

    public String sayHello(String name) {
        return ("hello " + name + "!");
    }

}
