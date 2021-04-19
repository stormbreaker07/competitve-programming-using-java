public interface List<T> {
    public  void insert(T data);
    public void remove(T data);
    public void traverse();
    public int size();
    public int Search(T data);
    public T Middle();
    public void createLoop();
    public Boolean DetectLoop();
}
