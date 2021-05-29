public class Main {

    public static void main(String[] args) {

        System.out.println("making a Veg Burger");
        VegBurger vegBurger = new VegBurger();
        vegBurger.makeBurger();
        System.out.println(" ");

        System.out.println("making a non veg Burger");
        NonVegBurger nonVegBurger = new NonVegBurger();
        nonVegBurger.makeBurger();
    }


}
