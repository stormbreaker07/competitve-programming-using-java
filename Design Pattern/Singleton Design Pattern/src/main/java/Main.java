import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        //in this example there is just a single thread that is the main thread which is accessing the singleton object
        //and we create singleton class in such a way that no more than one object is possible of singleton class.
        //but we have to synchronize while initilizing the object.
        //as if we dont do that then while thread1 is doing something thread2 will change the list
        // and thread1 will take the updated list as the main list so as all the Linkedlist are static in that class so
        // they are same for whole of the project.

        System.out.println("creating first object of singleton class");
        Singelton singelton = Singelton.getInstance();
        System.out.println(singelton.hashCode());
        LinkedList<String> list = singelton.getLetters();
        LinkedList<String> tiles = singelton.getTiles(6);
        System.out.println(list);
        System.out.println(tiles);

        System.out.println("create second object of singleton class");
        Singelton singelton1 = Singelton.getInstance();
        System.out.println(singelton1.hashCode());
        LinkedList<String> list1 = singelton1.getLetters();
        LinkedList<String> tiles1 = singelton1.getTiles(6);
        System.out.println(list);
        System.out.println(tiles);

    }
}
