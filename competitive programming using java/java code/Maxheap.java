import java.util.*;

class maxHeap {

    public int size = 0;
    public int maxSize = 0;
    public int[] heap;

    public maxHeap(int maxsize) {
        this.maxSize = maxsize;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE;  
    }

    public int parent(int pos)
    {
        return pos/2;
    }

    public int leftChild(int pos) {
        return (2*pos);
    }

    public int rightChild(int pos) {
        return (2*pos)+1;
    }

    public boolean isLeaf(int pos ) {
        if(pos>= this.size/2  && pos <=this.size)
        {
            return true;
        }
        return false;
    }

    public void swap(int s1 , int s2) {
        int x = heap[s1];
        heap[s1] = heap[s2];
        heap[s2] = x; 
    }

    public void insert(int element) {

        heap[++size] = element;
        int current = size;
        while(heap[current] > heap[parent(current)] ) {
            swap(current , parent(current));
            current = parent(current);
        }
    }

    public void heapify(int pos) {

        if(isLeaf(pos)) {return ;}

        if(heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
            if(heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos , leftChild(pos));
                heapify(leftChild(pos));
            }
            else {
                swap(pos , rightChild(pos));
                heapify(rightChild(pos));
            }
        }
    }

    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + 
                      heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]); 
            System.out.println(); 
        } 
    } 


} 




public class Maxheap {

    public static void main(String[] args) {
        maxHeap x = new maxHeap(15);
        x.insert(5); 
        x.insert(3); 
        x.insert(17); 
        x.insert(10); 
        x.insert(84); 
        x.insert(19); 
        x.insert(6); 
        x.insert(22); 
        x.insert(9); 

x.print();
    }
} 