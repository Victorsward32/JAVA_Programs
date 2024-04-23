package interview.wonderbiz;
import java.util.*;
public class LS {
    public static int length_of_LongestString(String str){
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        HashSet<Character>hash_set=new HashSet<>();

        while(b_pointer< str.length()){
            if(!hash_set.contains(str.charAt(b_pointer))){
                hash_set.add(str.charAt(b_pointer));
                b_pointer++;
                max=Math.max(hash_set.size(),max);

            } else{
                hash_set.remove(str.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first String");
        String str = sc.nextLine();
        int length = length_of_LongestString(str);
        System.out.println("The length of the longest substring without repeating characters is: " + length);
        sc.close(); // Don't forget to close the Scanner!
    }
    
    }
