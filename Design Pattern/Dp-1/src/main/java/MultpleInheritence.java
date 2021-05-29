public class MultpleInheritence implements Inherit1,Interface2 {

    private String name;
    private int age;

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

}
