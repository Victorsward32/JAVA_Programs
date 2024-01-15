package interview;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String f_str=sc.next();
        System.out.println("Enter the second String");
        String S_str=sc.next();

         // Create an array of strings where each element contains one character from f_str
        String arr[]=new String[f_str.length()];
        for (int i = 0; i < f_str.length(); i++) {
            arr[i]=String.valueOf(f_str.charAt(i));
            
        }
        System.out.println(Arrays.toString(arr));
         // Create an array of strings where each element contains one character from s_str

         String arr2[]=new String[S_str.length()];
         for (int i = 0; i < S_str.length(); i++) {
            arr2[i]=String.valueOf(S_str.charAt(i));
         }
         System.out.println(Arrays.toString(arr2));

         // Checking the elements are present or not in array

         boolean IsAnagaram=true;

         if (arr.length != arr2.length){
            IsAnagaram=false;
            
         }else{
            Arrays.sort(arr);
            Arrays.sort(arr2); 
            
            for (int i = 0; i < arr.length; i++) {
                if(!arr[i].equals(arr2[i])){
                    IsAnagaram=false ;
                    break;
    
                }
                
             }
         }
         if(IsAnagaram){
            System.out.println("The string is anagram");

         }else{
            System.out.println("The String are not anagram");

         }

    }
    
}
