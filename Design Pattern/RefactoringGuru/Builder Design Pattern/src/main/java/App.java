import java.util.Scanner;

public class App {
    private static Director director;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String carType = scan.nextLine();
        director = new Director(carType);
        Mannual finishedCar= director.makeCar();
        System.out.println(finishedCar);
    }
}
