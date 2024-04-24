package interview.wonderbiz;

import java.util.Scanner;

public class FnLonarray {

//     public static int FindTheFirstAndLastElementOfAnArray(int[] arr) {
//     if(arr.length==0){
//         return -1;  // base case
//     }

//     int firstElement = arr[0];
//     int lastElement = arr[arr.length-1];
    
//     return firstElement * 100 + lastElement;
// }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of your array here: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+i);
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        };

        int firstElement = arr[0];
        int lastElement = arr[arr.length-1];

        System.out.println("First element: " + firstElement+" last element: " + lastElement);


        // FindTheFirstAndLastElementOfAnArray(arr);

        sc.close();
    }
    
}
