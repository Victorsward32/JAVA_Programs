package DSA.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add("Sumit");
        al.add("Jadhav");
        al.add(22);

        System.out.println(al);

        HashSet hs=new HashSet();
        hs.add("Sumit");
        hs.add(22);
        System.out.println(hs);

    }
    
}
