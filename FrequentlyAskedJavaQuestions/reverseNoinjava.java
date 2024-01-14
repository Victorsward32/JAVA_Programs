package FrequentlyAskedJavaQuestions;

import java.util.Scanner;

public class reverseNoinjava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number here");
        int num=sc.nextInt();
        int Value=num;;
        int Value2=num;
        int total;
        
        int rev=0;

         while(Value!=0){
            rev=rev*10+Value%10;
            Value/=10;
        }
        System.out.println(rev);

        // Logic 2 String Buffer Class
        StringBuffer reverse;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        reverse=sb.reverse();

        System.out.println(reverse);

        // Logic 3 Using StringBuilder class 



    }

    
}
