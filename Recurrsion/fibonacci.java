package Recurrsion;
import java.util.*;

public class fibonacci {
    public static int fib_series(int num){
        if(num==0||num==1){
            return num;
        }else{
            return fib_series(num-2)+fib_series(num-1);

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        // int fst_N=0;
        // int Scnd_N=1;
        System.out.println(num);
        for(int i=1;i<=num;i++){
            System.out.println(fib_series(i));

        }

        
        
    }
    
}
