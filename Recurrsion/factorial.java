package Recurrsion;

import java.util.*;

public class factorial {

    public static int fact_orial(int val){
        
        if(val == 0 || val == 1){
            return 1;

        }
        else{
         return val*fact_orial(val-1);

        }




    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int val=sc.nextInt();
        int fact=fact_orial(val);

        System.out.println(val+" "+fact);
        sc.close();
    }
    
}

class facto {

    public static int printfacto(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factorial_nm1=printfacto(n-1);
        int  factorial_n= n*factorial_nm1;
        System.out.println(n);
        return factorial_n;

    }
    public static void main(String[] args) {
        int n=5;

        int ans=printfacto(n);

        System.out.println(ans);



    }


}
