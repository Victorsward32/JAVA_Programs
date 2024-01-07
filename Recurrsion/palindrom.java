package Recurrsion;

import interview.palindrome;
import java.util.*;

public class palindrom {
//     Given a string, find all possible palindromic partitions of given string.

// Note that this problem is different from Palindrome Partitioning Problem, there the task was to find the partitioning with minimum cuts in input string. Here we need to print all possible partitions.

// Example: 

// Input: nitin
// Output: n i t i n
// n iti n
// nitin

// Input: geeks
// Output: g e e k s
// g ee k s


// The idea is to use recursion and backtracking.

// Partition the string to generate the substrings.
// Check whether the substring generated is palindrome or not.
// If the substring generated is palindrome,
// then add this substring to our current list and recursively call the function for the remaining string.
// When the end of the string is reached the current list is added to the result.
// Below is the implementation of above approach.

public static boolean palindrome(String str, int Start, int end) {
//    Base Case
    if(Start>=end){
        return true;
    }
    else 
    {
        if(str.charAt(Start)==str.charAt(end)){
            return palindrome(str, Start+1, end-1);
            
    } else{
        return false;
    }
}
    
}
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string here");
    String input=sc.next();

    String Lowercaseinput=input.toLowerCase();

    boolean result=palindrome(Lowercaseinput, 0, Lowercaseinput.length()-1);
    System.out.println(result);
    
    if (result) {
        System.out.println("The string is a palindrome.");
    } else {
        System.out.println("The string is not a palindrome.");
    }  
    
    
    
    
//     String name="Sumit";
//     String copy=name;
//     String rev="";

//     for(int i=copy.length()-1;i>=0;i--){
//         rev+=copy.charAt(i);
//     }

//     System.out.println(rev);
//     if (name==rev){
//         System.out.println("String is palindrom");

//     }
//     else{
//         System.out.println("String is not palindrom ");
        
//     }
    
}
    
}
