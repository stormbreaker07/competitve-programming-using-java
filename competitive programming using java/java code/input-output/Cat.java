import java.util.*;
import java.io.*;

public class Cat implements Serializable{

    public String name;

    public Cat(String name) {
        this.name = name;

    } 

    public String getCat() {
        return this.name;
    }

    public void setCat(String name) {
        this.name = name;
    }

    public String toString() {
        return ("the cat name is " + name);
    }

}
