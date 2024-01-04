import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         int size=5;
        Scanner sc= new Scanner(System.in);
        int []arr=new int[size];
        for (int l=0;l<size ;l++){
            arr[l]=sc.nextInt();
        }
       

        int arr2[]=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));
        int temp2=0;
        int temp=0;
        for(int i=0 ; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; 
            }
            
            }
            
        }
        
        // System.out.println(Arrays.toString(arr));
        // second higest no is 7
        System.out.println("second largest element"+" :- "+arr[1]);
    
        // Finding the smallest elemnt in array
        // for (int a = 0; a < arr.length; a++) {
        //     for(int b = 0; b < arr.length; b++){
        //         if(arr[a]>arr[b+1]){
        //             temp2=arr[a];
        //             arr[a]=arr[b];
        //             arr[b]=temp2;

        //         }

                
        //     }

            
        // }
        //  System.out.println(arr2[1]);
    
    }
    
}
