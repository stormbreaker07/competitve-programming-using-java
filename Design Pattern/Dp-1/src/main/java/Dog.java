public class Dog extends Animals{

    private int height;

    public Dog() {
        super();
        setSound("Bark");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int Bws() {
        int w = this.getWeight()/height;
        return w;
    }
}
