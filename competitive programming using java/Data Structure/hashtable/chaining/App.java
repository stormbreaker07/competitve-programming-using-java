

public class App {

    public static void main(String[] args) {

        HashTable hashtable = new HashTable(20);
        hashtable.insert(10 , 23);
        hashtable.insert(12 , 45);
        hashtable.insert(6 , 8);
        hashtable.insert(2 , 112);
        hashtable.insert(30 , 234);
        
        System.out.println(hashtable.search(10));
        System.out.println(hashtable.search(12));
        System.out.println(hashtable.search(30));
        System.out.println(hashtable.search(50));


    }




}