import java.util.Scanner;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextLine()) {
            String vechile = scan.nextLine();
            FactoryProducer factoryProducer = new FactoryProducer();
            factoryProducer.chosseVechile(vechile);
        }


    }
}
