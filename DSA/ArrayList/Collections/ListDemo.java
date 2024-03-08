package DSA.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        list1.add(0, "Sumit");
        list1.add(40);
        list1.add("Jadhav");

        // it follows indexed based insertion
        System.out.println(list1);

        // list can add duplicate elements inside the memory
        list1.add(40);
        System.out.println(list1);

        // list can store any number of null values
        list1.add(null);
        list1.add(null);
        System.out.println(list1);

        // retrieve elements one by one using an Iterator
        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
