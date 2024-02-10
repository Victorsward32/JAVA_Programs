package BitManipulation;

import java.util.Scanner;

public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Here Enter your Number: -");
        int num=sc.nextInt();

        if((num & 1)==0 ){
            System.out.println("No is Even");
        }else{
            System.out.println("no is odd");
        }
        System.out.println(num);

    }
    
}
