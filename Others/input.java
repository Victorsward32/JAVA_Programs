package Others;

import java.util.*;
public class input {
    public static void main(String[] args) {
        // make a count
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of names");
        int count=sc.nextInt();
        System.out.println("enter the name");

        for(int i=0;i<count;i++){
            String name=sc.next();
            System.out.println("Hi"+name);
        }

    }
    
}
