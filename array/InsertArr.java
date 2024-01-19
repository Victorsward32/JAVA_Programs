package array;

import java.util.*;

public class InsertArr {
    static void insertelement(int arr[],int pos,int Value){

        for (int i = arr.length-1; i <pos-1; i++) {
            arr[i]=arr[i-1];

            
        }
        arr[pos-1]=Value;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(","+arr[i]);
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,67,2,7};
        Scanner sc=new Scanner(System.in);
        int pos=3;
        int Value=100;

        insertelement(arr, pos, Value);

        
    }
    
}
