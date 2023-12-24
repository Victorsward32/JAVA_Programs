package interview;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the data here:- ");
    String x=sc.next();
    String y=x;
    String rev="";

    for(int i=y.length()-1;i>0;i--){
        rev+=y.charAt(i);

    }
    if(rev==x){

        System.out.println("your data contain palindrom");
    }
    else{
         System.out.println("your data can't contain palindrom");
    }
      
    
   
   
}

}
