package interview.wonderbiz;

import java.util.Scanner;

public class Palindrome {
    public static int intpalindrom(int value){
        int temp=value,rev=0;
        while(value>0){
            int rem=value%10;
            rev=rev*10+rem;
            value=value/10;
        }
        if(temp==rev){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        return 0;
    }

    public static String stringpalindrom(String input){
        String temp=input;
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev+=input.charAt(i);

        }
        if(temp.equals(rev)){
            System.out.println("The string is a palindrome");

        }else{
            System.out.println("The string is not a palindrome");

        }
        return "";

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter if you want to check palindrome for integer type 1 for string type 2 : ");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Enter the number: ");
            int value=sc.nextInt();
            int result=intpalindrom(value);


        }else if (num==2) {
            System.out.println("ENter the String Here");
            String input=sc.next();
            String result=stringpalindrom(input);
            
        } else {
            
        }{
            System.out.println("YOu choosed Wrong Option here");
            
        }
        
        sc.close();
    }
    
}
