package Example1;

import java.net.*;

public class InetclassPractise {

    public static void main(String[] args) {
        try
        {
            //these three are factory methods
            InetAddress ad = InetAddress.getByName("localhost");
            InetAddress ad2 = InetAddress.getLocalHost();
            InetAddress[] ad3 = InetAddress.getAllByName("www.google.com");

            System.out.println(ad);
            System.out.println(ad2);
            for(int i=0;i<ad3.length;i++)
            {System.out.println(ad3[i]);}

            //these are instance method
            System.out.println(ad.getHostAddress());
            System.out.println(ad.getHostName());
            System.out.println(ad.isMulticastAddress());
            byte[] a = ad.getAddress();
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }

        } catch(
                Exception e)
        {
            e.printStackTrace();
        }
    }

}
