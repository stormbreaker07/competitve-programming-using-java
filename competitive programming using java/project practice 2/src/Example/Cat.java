package Example;

public class Cat implements Comparable<Cat> {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Cat o) {
        return this.age - o.age;
    }
    @Override
    public String toString() {
        return "Cat{ age=" + age + "}";
    }
}
