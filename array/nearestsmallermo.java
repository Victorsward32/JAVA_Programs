// Question: Find the nearest smaller number for each element in the array.
// element such thet the smaller element is on the left side.
// Input {3,2,1,4,5}
// Output {-1,-1,-1,1,4}



package array;

import java.util.Stack;

public class nearestsmallermo {
    public static void main(String [] args){
        int [] inputarr={1,6,4,10,2,5};
        int [] result=new int[inputarr.length];

        
        nearest_num(inputarr, result);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    public static int[] nearest_num(int[] inputarr,int[]result){
        
        Stack <Integer> stack= new Stack<>();

        for(int i=0;i<inputarr.length;i++){
            
            while(!stack.isEmpty()&& inputarr[i]< inputarr[stack.peek()]){
                result[stack.pop()]=inputarr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            result[stack.pop()]=-1;
        }
        
        


        return result;

    }
    
}
