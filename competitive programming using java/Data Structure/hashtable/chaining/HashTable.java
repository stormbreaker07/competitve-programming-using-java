public class HashTable {

    public HashItem[] hashTable;
    private int n;
    public HashTable(int n) {
        this.n = n;
        hashTable = new HashItem[n];
    }
    

    public void insert(int key , int value) {

        int hash = findHash(key);
        if(hashTable[hash] ==  null) {
            hashTable[hash] = new HashItem(key , value);
        }
        else {
            HashItem item = new HashItem(key , value);
            HashItem point = hashTable[hash];
            while(point.next != null) {
                point = point.next;
            }
            point.next = item;
        }
    }


    public int search(int key) {
        
        int hash = findHash(key);
        if(hashTable[hash] == null ) {
            return -1;
        }
        else {
            HashItem item = hashTable[hash];
            while(item != null && item.key!= key) {
                item = item.next;
            }
            if(item== null) {
                return -1;
            }
            return item.value;
        }
    }


    public int findHash(int key) {
        return key%n;
    }

}