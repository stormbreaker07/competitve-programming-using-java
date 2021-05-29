public class NonVegBurger extends AbstractBurger{

    public Boolean customerWantCheeze() { return false;}
    public Boolean customerWantVeggies() { return false;}


    @Override
    void addMeat() {
        System.out.println("Meat is added in the burger");
    }

    @Override
    void addVeggies() {
        System.out.println("veggies is added in the burger");
    }

    @Override
    void addVinegar() {
        System.out.println("Vinegar is poured in the burger");
    }

    @Override
    void addCheeze() {
        System.out.println("Cheeze is added in the burger");
    }

}
