

public class HashItem {

    public int key;
    public int value;
    public HashItem next;

    public HashItem(int key , int value ,HashItem next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public HashItem(int key , int value ) {
        this.key = key;
        this.value = value;
    }



}