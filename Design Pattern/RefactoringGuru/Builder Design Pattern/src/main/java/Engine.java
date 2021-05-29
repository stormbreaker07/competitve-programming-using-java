public class Engine {

    private String horsePower;
    private String name;
    private String type;

    public Engine() { }

    public Engine(String horsePower , String name , String type) {
        this.horsePower = horsePower;
        this.name = name;
        this.type = type;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower='" + horsePower + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
