public class Sheep implements Animal{

    public Sheep() {
        System.out.println("default sheep constructor is called");
    }


    @Override
    public Animal makeClone() {
        System.out.println("clone of sheep is creating here");

        try {
            Animal sheep = (Sheep) super.clone();
            return sheep;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
