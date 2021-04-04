import java.util.*;


class Storage<T> {

    public T item;

    public void getItem(T data ) {
        this.item = data;
    }

    public void output() {
        System.out.println(item.toString());
    }

}



public class Generic_syntex {
    
    public static void main(String[] args) {

        Storage<String> data = new Storage<>();
        data.getItem("hello world");
        data.output();
    }
}