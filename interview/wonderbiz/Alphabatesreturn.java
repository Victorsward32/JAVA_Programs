// package interview.wonderbiz;
// import java.util.*;

// public class Alphabatesreturn {
//     //Find the no of times alphabates return in time 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println(" Enter your String here: ");
//         String val=sc.nextLine();
        


//         for(int i=0;i<val.length();i++){
//             int count=0;
            
//             for(int j=0;j<val.length();j++){
//                 if (val.charAt(i)==val.charAt(j)){
//                     count++;
//                                 }
//             }
//             System.out.println(val.charAt(i)+" returns "+count+" times");
//         }
//     }
    
// }

package interview.wonderbiz;
import java.util.*;

public class Alphabatesreturn {
    //Find the no of times alphabates return in time 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter your String here: ");
        String val=sc.nextLine();
        HashSet<Character> counted = new HashSet<Character>();

        for(int i=0;i<val.length();i++){
            char c = val.charAt(i);
            if (!counted.contains(c)) {
                int count=0;
                for(int j=i+1;j<val.length();j++){
                    if (c==val.charAt(j)){
                        count++;
                    }
                }
                System.out.println(c+" returns "+(count+1)+" times");
                counted.add(c);
                
            }
        }
    }
}

