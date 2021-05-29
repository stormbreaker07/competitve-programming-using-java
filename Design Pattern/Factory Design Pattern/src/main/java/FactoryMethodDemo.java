import java.util.Scanner;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        FactoryShape factoryShape = new FactoryShape();
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextLine()) {
            String shape = scan.nextLine();
            System.out.println(shape);
            Shape newShape = factoryShape.chooseShape(shape);
            System.out.println(newShape.getShapeType() + "  " + newShape.getNumberOfSides());
        }
    }
}
