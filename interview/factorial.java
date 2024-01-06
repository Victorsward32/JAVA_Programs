package interview;

import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter your Number:- ");
     int Num=sc.nextInt();
     int Fact=1;
     for (int i = 1; i <=Num; i++) {
        // System.out.println(NcharAt(i));
        Fact*=i;
        
     }  
     System.out.println("Here is your facctorial:-"+Fact);
    }
}
