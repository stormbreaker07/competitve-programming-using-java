package game;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfigration.xml");
//        Game game1 = context.getBean("football", Game.class);
//        Football football = (Football) context.getBean("football");
//        System.out.println(game1.gameInfo());
//        System.out.println(football.gameInfo());
    }
}
