package DSA.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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

        List l=new ArrayList<>();

        // List L2=new HashSet<>();
        // It will provide Error Beacuse hashset cant inherit the list properties

    }
    
}

class test{
    public static void main(String[] args) {
        HashMap hm= new HashMap<>();
        hm.put(101, "abc");
        hm.put(102, "def");
        hm.put(103, "ghi");

        System.out.println(hm);
         
    }
}
