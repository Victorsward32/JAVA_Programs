package FrequentlyAskedJavaQuestions;

public class swap {
    public static void main(String[] args) {
        // logic 1- using temporary variable to swapping the values
        int a=12,b=25;
        System.out.println(a+" "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
         System.out.println(a+" "+b);

        // Logic 2- using + and - arithmetic operators
        a=a+b;//25+12=37
        b=a-b;//37-12=25
        a=a-b;//37-25=12
        System.out.println(a+" "+b);
        // Logic 2- using * and / arithmetic operators
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
        // Logic4:- Swapping value  Bitwise XoR(^)
          a=a^b;
          b=a^b;
          a=a^b;
          System.out.println(a+" "+b);
        // Logic 5:- Single Statement
        b=a+b-(a=b);
        System.out.println(a+" "+b);
    }
    
}
