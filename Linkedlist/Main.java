package Linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //linked list
        int n=5;
        for (int i = 1; i <= n-1; i++) {
            for (int s = n; s >= i; s--) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
                
            }
            for (int j = n; j >=i; j--) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    

}
}

