import java.util.*;

public class MultiExecuter {

    public static void main(String[] args) {

        ArrayList<task> Tasks = new ArrayList<>();
        Tasks.add(new task("Sorting"));
        Tasks.add(new task("Searching"));


        ArrayList<Thread> MultipleOperation = new ArrayList<>();
        for(task x: Tasks) {
           MultipleOperation.add(new newThread(x)); 
        }

        for(Thread x : MultipleOperation) {
            x.start();
        }

    }
}



class newThread extends Thread {
    task newTask;

    public newThread(task newTask) {
        this.newTask = newTask;
    }

public void run() {
    System.out.println("thread start running");
    if(newTask.operation == "Sorting")
    {
        for(int x : newTask.element)
        {
            try {
                Thread.sleep(500);
            }
            catch(Exception e) {

            }
            System.out.println("the sorting take place at element " + x);
        }
    }
    else
    {
        for(int x : newTask.element)
        {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {

            }
            System.out.println("the searching take place at element " + x);
        }
    }
    }

}


class task {

    int[] element = new int[10];
    String operation;
    public task(String task) {
        for(int i=0;i<10;i++)
        {
            Random random = new Random();
            element[i] = random.nextInt(100);
        }

        this.operation = task;
    }

}
