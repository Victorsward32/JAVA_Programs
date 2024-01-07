package Recurrsion;
// Question //
// Print a pattern without using any loop (using recursion):
// Follow the given steps to solve the problem:

// Create a recursive function with parameters as n and m and flag variable set as true
// Print m and if the flag is false and the value of m is equal to n then return from the function
// If the flag is true then check
// If m-5 is greater than zero then recur for m-5
// Else recur for m-5 and set the flag to false, as now we will be moving backward
// Else recur for m+5
// Below is the implementation of the above approach:

public class patternwithRecursion {
    public static void recurrsion(int n,int m,boolean flag){
        System.out.print(m+" ");
        if(flag == false && m== n){
            System.out.println(m);
            return;

        }

        if(flag== true ){

            if(m -5 >0){
                recurrsion(n,m-5,true);

            }
            else{
                recurrsion(n,m-5,false);

            }


            }
            else{
                recurrsion(n,m+5,false);
           
            
        }
        
    }
    public static void main(String[] args) {
        int n=10;
       
        boolean flag=true;
        recurrsion(n,n,true);


        
    }
    
}
