import java.util.*;

public interface Tree<T> {

    public void insert(T data);
    public void remove(T data);
    public void pre_order();
    public void post_order();
    public void in_order();
    public T getMax() throws emptyBst;
    public T getMin() throws emptyBst;

}