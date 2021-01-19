import java.util.*;

public class banking_app {

    public static void main(String[] args) {

        Bank icici = new Bank("Icici bank");
        icici.add_branch("moradabad");
        icici.getBranch();

        System.out.println( icici.add_customer("moradabad", "tanuj yadav", 100) );
        System.out.println( icici.add_customerTransaction("moradabad", "tanuj yadav", 150) );
        System.out.println( icici.add_customerTransaction("moradabad", "tanuj yadav", 23) );
        System.out.println( icici.total_amount("moradabad", "tanuj yadav"));

        System.out.println( "let see another account" );
        
        Bank axis = new Bank("axis bank");
        axis.add_branch("meerut");
        axis.getBranch();
        System.out.println( axis.add_customer("meerut", "manoj kumar", 1000) );
        System.out.println( axis.add_customerTransaction("meerut", "manoj kumar", -150) );
        System.out.println( axis.add_customerTransaction("meerut", "manoj kumar", 23) );
        System.out.println(axis.total_amount("meerut", "manoj kumar"));


    }
}

class Customer {

    ArrayList<Double> transaction;
    String name;
    private double total_amount = 0; 

    public Customer(String name1, double intial_amount) {
        this.name = name1;
        this.transaction = new ArrayList<Double>();
        transaction.add(intial_amount);
        this.total_amount +=intial_amount;
    }

    public void add_transaction(double amount) {
        this.transaction.add(amount);
        this.total_amount +=amount;
    }

    public String getName() {
        return this.name;
    }

    public double total_money() {
        return this.total_amount;
    }

    public ArrayList<Double> getTransaction() {
        return this.transaction;
    }

}

class Branches {

    ArrayList<Customer> customer;
    String branch_name;

    public Branches(String name) {
        this.branch_name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getName() {
        return branch_name;
    }

    public double total_amount(String name ) {

       for(int i=0;i<customer.size();i++)
       {
            if( customer.get(i).getName().equals(name))
            {
                return (customer.get(i).total_money());
            }
       }
       return 0;
    }

    public boolean new_customer(String name, double transaction) {
        if (find_customer(name) == null) {
            customer.add(new Customer(name, transaction));
            return true;
        }
        return false;
    }

    public boolean add_customer_transaction(String name, double transaction) {
        Customer custo = find_customer(name);
        if (custo != null) {
            custo.add_transaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    public Customer find_customer(String name) {
        for (int i = 0; i < customer.size(); i++) {
            if (this.customer.get(i).getName().equals(name)) {
                return this.customer.get(i);
            }
        }
        return null;
    }

}

class Bank {

    String bank;
    ArrayList<Branches> branch;

    public Bank(String name1) {
        this.bank = name1;
        this.branch = new ArrayList<Branches>();
    }

    public void getBranch() {
        for (int i = 0; i < this.branch.size(); i++) {
            System.out.println(branch.get(i).getName());
        }
    }

    public boolean add_branch(String name) {

        Branches temp_branch = find_branch(name);
        if (temp_branch == null) {
            branch.add(new Branches(name));
            return true;
        } else {
            
            return false;
        }
    }


    public double total_amount(String branchName , String name) {
        for(int i=0;i<branch.size();i++)
        {
            if(this.branch.get(i).getName().equals(branchName))
            {
                return this.branch.get(i).total_amount(name);
            }
        }
        return 0;
    }

    public boolean add_customer(String branchName, String name, double transaction) {
        Branches temp_branch = find_branch(branchName);
        if (temp_branch != null) {
            boolean x = temp_branch.new_customer(name, transaction);
            return x;
        }
        return false;

    }

    public boolean add_customerTransaction(String branchName, String name, double transaction) {

        Branches temp_branch = find_branch(branchName);
        if (temp_branch != null) {
            boolean x = temp_branch.add_customer_transaction(name, transaction);
            return x;
        }
        return false;

    }

    public Branches find_branch(String name) {
        for (int i = 0; i < this.branch.size(); i++) {
            if (this.branch.get(i).getName().equals(name)) {
                return this.branch.get(i);
            }
        }
        return null;
    }

}