package FrequentlyAskedJavaQuestions;

import java.util.Scanner;

public class reverseNoinjava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number here");
        int num=sc.nextInt();
        int Value=num;
        int temp=0;

        while(Value!=0){
            temp=temp*10+Value%10;
            Value/=10;

        }
        System.out.println(temp);

    }

    
}
