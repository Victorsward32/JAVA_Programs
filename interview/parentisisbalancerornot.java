// package interview;

// import java.util.Stack;

// public class parentisisbalancerornot {
//     public static void main(String[] args) {
//         String data="{([])}";
//         // They Balanced or not
//         char array[]=data.toCharArray();
//         Stack<Character> stack=new Stack<>();
//         for(char c:array){
//             if(c=='('|| c=='['||c=='{'){
//                 stack.push(c);
//             }else{
//                 if(stack.isEmpty() || !isMatchingPair(stack.pop(),c))
//                 {
//                     return "No";
//                 }
//             }

//         }
//         return stack.isEmpty() ? "yes": "No";

//     }
    
//     static boolean isMatchingPair(char open, char close ){
//         return(open=='('&& close == ')')||
//         (open=='['&& close == ']')||
//         (open=='{'&& close == '}');
//     }
// }
package interview;

import java.util.Stack;
import java.util.Scanner;

public class parentisisbalancerornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Parenthesis '{ ( [ ] ) }'");
        String data=sc.next();
        // Check if they are balanced
        char array[]=data.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:array){
            if(c=='('|| c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty() || !isMatchingPair(stack.pop(),c))
                {
                    System.out.println("No");
                    return;
                }
            }

        }
        System.out.println("Yes");
    }

    static boolean isMatchingPair(char open, char close ){
        return(open=='('&& close == ')')||
        (open=='['&& close == ']')||
        (open=='{'&& close == '}');
    }
}
/*
output 1
Enter your Parenthesis '{ ( [ ] ) }'
{([])} 
Yes

output 2
 Enter your Parenthesis '{ ( [ ] ) }'
{([)}
No
 */