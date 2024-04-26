package interview;

import java.util.Scanner;

// question 
public class question1 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n=Sc.nextInt();;
        int lastvalue;
        long last_result=0;
        int total=0;

        while(n!=0){
            lastvalue=n%10;
            last_result=last_result*10+lastvalue;
            n=n/10;
            total=total+lastvalue;
            if(last_result>Integer.MAX_VALUE|| last_result<Integer.MIN_VALUE){
                System.out.println(0);
                }

        }

        System.out.println(last_result);
        System.out.println("total="+total);
    }
}
