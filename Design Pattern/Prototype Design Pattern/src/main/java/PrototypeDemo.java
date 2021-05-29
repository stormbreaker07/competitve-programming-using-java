public class PrototypeDemo {

    public static void main(String[] args) {


        CLoneFactory cLoneFactory = new CLoneFactory();
        Sheep sheep = new Sheep();
        Sheep sheep2 = (Sheep) cLoneFactory.getAnimalClone(sheep);
        System.out.println(sheep.hashCode());
        System.out.println(sheep2.hashCode());
    }

}
