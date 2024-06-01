package Leetcode;

import java.util.Scanner;

class GCDStrings {
 public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the First String here");
    String str1=sc.next();
    System.out.println("Enter the Second String here");
    String str2=sc.next();
    gcdOfStrings(str1, str2);
    
 }


    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2, str1);
        }
        if(str2.equals(str1)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);

        }
        return "";
    }
}
