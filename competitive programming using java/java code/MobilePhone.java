import java.util.*;

public class MobilePhone {

   // Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        Contacts contact = new Contacts();

        num = s.nextInt();
        boolean flag = true;
        while(flag) {
            num = s.nextInt();
            contact.choose_operation(num);
        }


        s.close();
    }

}


class Contacts {

    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> number = new ArrayList<String>();

    Scanner s = new Scanner(System.in);
    public void choose_operation(int num) {

        switch(num) {
            case 1 :
            {
               showContact();
            }
            case 2 :
            {
               showSpecificContact();
            }
            case 3 : 
            {
                addContact();
            }
            case 4 : 
            {
                updateContact();
            }
            case 5 : 
            {
                deleteContact();
            }
            case 6 : 
            {

            }
            default: {
                System.out.println("quiting from hell");
            }
        }
}


    private void showContact() {
        
        for(int i=0;i<name.size();i++)
        {
            System.out.println("name: " + name.get(i) + " == " + number.get(i) );
        }

    }

    private void showSpecificContact() {
        String name1 = s.nextLine();
        int pos = findContact(name1);
        System.out.println("the contact is " + name.get(pos)  + ":" + number.get(pos));   
    }

    private void addContact() 
    {
        String temp_name = s.nextLine();
        String numb = s.nextLine();
        name.add(temp_name);
        name.add(numb);

    }

    private void updateContact() {
        
        String name1 = s.nextLine();
        String num = s.nextLine();
        

        int ind = findContact(name1);
        if(ind >=0)
        {
            updateNumber(ind , name1 ,num);
        }
        else
        {
            System.out.println("no contact with this property");
        }
    }

    private int findContact(String name1) {
        int x = name.indexOf(name1);
        return x;
    }

    private void updateNumber(int pos , String name1 , String num)
    {
        name.set(pos , name1);
        number.set(pos , num);
    }

    private void deleteContact() {
        String name1 = s.nextLine();
        int ind = findContact(name1);
        removeContact(ind);
    }

    private void removeContact(int pos) {
        System.out.println("deleted number is " + name.get(pos) + ":"  + number.get(pos));
        name.remove( pos );
        number.remove(pos);
    }


}