public class App1 {

    public static void main(String[] args) {
    
    LinkList<Integer> list = new LinkList<>();
        list.insert(19);
        list.insert(23);
        list.insert(321);
        list.insert(662);
        list.insert(820);
        list.insert(65);
        list.insert(80);
        list.insert(120);
        list.insert(20);
        list.insert(82);

      list.createLoop();
      //list.traverse();
      System.out.println(list.DetectLoop());
        

    }
}