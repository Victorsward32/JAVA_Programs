package array;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicates {

    // Use this Method When we Have a sorted Array only

    static void Duplicatesfornum(int arr2[],int temp[],int j){

        for (int i = 0; i < arr2.length-1; i++) {
            if(arr2[i]!=arr2[i+1]){
                temp[j]=arr2[i];
                j++;

            }
            
        }
        temp[j]=arr2[arr2.length-1];

        for (int i = 0; i < j+1; i++) {
            System.out.print(temp[i]+" ");
            
        }


System.out.println();

    }
    static void DuplicatesforDubInt(int arr[]){
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i]>=arr[i+1]){
        //         int temp=arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1]=temp;



        //     }
            
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
            
        // }

    }
    static void HashRemove(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
            
        }
        for(int no:hs){
            System.out.print(no+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,5,3,2,1};
        int arr2[]={1,2,2,3,4,5,6};
        int temp[]=new int[arr2.length];
        int j=0;

        Duplicatesfornum(arr2, temp, j);
        DuplicatesforDubInt(arr);
        HashRemove(arr);
      

          
    }
    
    
}
