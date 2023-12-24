package interview;
import java.util.Scanner;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no here");
        int n=sc.nextInt();
        int m=n;
        int z=0;
        int first_term=0;
        int second_term=1;

        System.out.println();

        while(first_term<=n){

            first_term=second_term;
            second_term=z;
            z=first_term+second_term;



            System.out.println(z);
        }
        



    }
}
