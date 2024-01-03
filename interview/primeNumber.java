package interview;
import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your Number here");
        int Input=Sc.nextInt();
        int temp=0;
        for (int i=2;i<Input-1;i++){
            if(Input%i == 0){
                 temp=temp+1;
            }
        }
        if(temp == 0){
            System.out.println("No is prime");
        }
        else{
            System.out.println("not prime no");
        } 
        
    }
    
}
