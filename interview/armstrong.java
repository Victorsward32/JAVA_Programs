package interview;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Your No:-");
        int n=Sc.nextInt();
        int z=n; 
        int digit_count=0;
        int m=n;
        int result_value=0;
        int armstrong=0;

        // while(z>0){
        //     digit_count=digit_count+1;
        //     z/=10;
        // }
        // System.out.println(digit_count);
        
        while (m>0){
            int digit=m%10;
            result_value=result_value*10+digit;
            m=m/10;

        }
        System.out.println(m);
    }

}