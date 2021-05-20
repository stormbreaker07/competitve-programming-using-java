
public class FenwickTree {


    public int[] a;
    public int[] tree;
    public int ind=0;
    public int n;

    public FenwickTree(int[] arr) {

        a = arr;
        tree = new int[a.length+1];
        n = a.length;
    }



    public void construct() {

        for(int i=0;i<n;i++) {
            update(i);
        }
    }
    
    public void update(int index) {
        int val = a[index];
        index +=1;
        while(index<=n) {
            tree[index] += val;
            index += index&(-index);
        }

    }

    public int Sum(int index) {
        int sum =0;
        index += 1;
        while(index>0) {
            sum += tree[index];
            index -= index&(-index);
        }
    
    return sum;
    }
}