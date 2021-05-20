public class Heap {

    public int heapSize = 0;
    public int[] heap;

    public Heap(int size) {

        heap = new int[size];
    }


    public void insert(int data) {
        if(heapSize >= heap.length) {
            throw new RuntimeException("heap is full"); 
        }


        heap[heapSize] = data;
        heapSize++;
        fitUp(heapSize-1);

        return ;
    }

    public void fitUp(int index) {

        int parentIndex = (index-1)/2;

        if( index>0 && heap[index] > heap[parentIndex]) {
            swap(index , parentIndex);
            fitUp(parentIndex);
        }
        return ;
    }

    public int getMax() {

        System.out.println(heapSize);
        if(heapSize ==0) {
            throw new RuntimeException("heap is empty");
        }

        return  heap[0];
    }

    public int poll() {

        int mx = getMax();

        swap(0 , heapSize-1);
        heapSize--;

        fitDown(0);
        return mx;
    }

    public void fitDown(int index) {
        int leftChildIndex = 2*index + 1;
        int rightChildIndex = 2*index + 2;

        int largestIndex = index;

        if( leftChildIndex <heapSize && heap[leftChildIndex]>heap[index] ) {
            largestIndex = leftChildIndex;
        }

        if(rightChildIndex < heapSize && heap[rightChildIndex]>heap[index] ) {
            largestIndex = rightChildIndex;
        }

        if(largestIndex != index) {
        
            swap(largestIndex , index);
            fitDown(largestIndex);
        }
        return ;
    }



    public void swap(int index , int parentIndex) {

        int val = heap[index];
        heap[index] = heap[parentIndex];
        heap[parentIndex] = val;
        return ;
    }


}