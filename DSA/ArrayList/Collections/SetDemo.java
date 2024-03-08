package DSA.ArrayList.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class SetDemo {
    public static void main(String[] args) {
       Set set=new HashSet<>();
       set.add("Sumit");
       set.add("sudhir");
       set.add("jadhav");
       set.add(22);
       set.add("Electronics and Computer Science");
       //It Doesnt follow insertion order and its not indexd based datastructure
       System.out.println(set);
       //set doest add duplicate values inside the hash map
       set.add("jadhav");
       System.out.println(set);
       //set cannot store multiole null values
       set.add(null);
       set.add(null);
       System.out.println(set);
       
        // retrieve elements one by one using an Iterator
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    
}
