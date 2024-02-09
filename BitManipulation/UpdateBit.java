package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
         System.out.println("Update the 2nd bit (postion = 1)of a number n to 1 (n=0101)");
         int n=5;
         //set method using or
         int pos=2;
         int bitmask=1<<pos; 
         int newNumber= n|bitmask;
         System.out.println(newNumber);
         //clear method using and
         int pos2=3;
         int bitmask2=1<<pos;
         int notbitmask=~bitmask2;
         int anotherNumber=n & notbitmask;
         System.out.println(anotherNumber);

    }
    
}

class Daynamically{
    public static void main(String[] args) {
        System.out.println("Oper:1 = set  oper:0 : clear");
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int  pos=1;
        if(oper==1){
            int bitmask = 1<<pos;
            int newNumber= bitmask | n;
            System.out.println(newNumber);

        }else{
            int bitmask= 1<<pos;
            int notbitmask=~bitmask;
            int newNumber=notbitmask&n;
            System.out.println(newNumber);
        }




    }
}
