package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first String");
        String s=sc.nextLine();
        System.out.println("Enter the second String");
        String t=sc.nextLine();
        sc.close();

        boolean ans=IsAnagaram(s,t);
        if(ans){
            System.out.println("The string is anagram");
        }else{
            System.out.println("The string is not anagram");
        }
        
    }
    public static boolean IsAnagaram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

         // Compare sorted arrays
         for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    
}
