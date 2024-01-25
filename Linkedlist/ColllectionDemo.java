package Linkedlist;
import java.util.LinkedList;

public class ColllectionDemo {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(0,"sumit");
        l1.add(1,"Jadhav");
        l1.add(2,"Jadhav");
         l1.add(3,123);
        l1.add(4,784.4);
        l1.add(5,true);
        l1.add(6,null); 

        l1.addAll(l1);
        l1.remove(0);
        System.out.println(l1.contains("Jadhav"));
        System.out.println(l1.contains("jadhav"));
        // l1.clear();
        if (l1.isEmpty()) {
            System.out.println("True");
            
        } else {
            System.out.println("False");
            
        }
        
        System.out.println(l1.get(0   ));
        
        System.out.println(l1);
    }
    
}
