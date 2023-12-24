package interview;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // String name="SUMIT";
        // String rev_name="";
        // for(int i=name.length() -1;i>=0;i--){

        //     rev_name=rev_name+name.charAt(i);

        // }
        // System.out.println(rev_name);
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for(int i=A.length()-1;i>=0;i--){
            B=B+A.charAt(i);
        }
       System.out.println("Here is your reverse String:- "+B);
    }
}
