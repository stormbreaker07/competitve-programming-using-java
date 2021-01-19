import java.util.*;

public class StringbufferClass {

    public static void main(String[] args) {
        
        //create StringBuffer object
        StringBuffer x = new StringBuffer();
        
        Scanner scan = new Scanner(System.in);
        
        //append a string
        x.append(scan.nextLine());
        System.out.println(x);
        
        //length() method
        System.out.println(x.length());
        
        //capacity method
        //the stringbuffer when we create make a 16character capacity because modifing is a costly process.
        System.out.println(x.capacity());
        
        //setlength method is use to update the length of stringbuffer
        x.setLength(9);

        System.out.println(x.capacity() + " " + x + " " + x.length());

        //charAt method we know it
        System.out.println(x.charAt(4));

        //setCharAt() method to update a char in stringbuffer
        x.setCharAt(3 , 'R');          
        System.out.println("use setCharAt method at index 3 " + x);

        char arr[] = new char[100];
        x.getChars(3 , 8 , arr , 0);
        System.out.println(arr);

        //append method use to concatinate string to stringBuffer
        System.out.println(x.append(" my name is"));
        
        //insert method
        x.insert(2 , " day/night ");
        System.out.println(x);
        
        //reverse the important thing is new onject of stringbuffer
        //is not created the same object is converted into new one
        x.reverse();
        System.out.println(x);
    
        //deleteCharAt() to delete char at particulat position
        //delete(i , j) to delete substring [i , j);


        // subString() overloaded method it returns a string not a stringbuffer so,
        //keep in mind it doesnt effect the reall stringbuffer object we used
        String w = x.substring(2 , 7);
        System.out.println(w);

        //replace similar act on direct stringbuffer object we are using [i , j) end limit is open
        //so excluded        System.out.println(x.append(" my name is"));

    }
}