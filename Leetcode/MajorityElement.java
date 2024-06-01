package Leetcode;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Enter your data length here: - ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter your data here: - ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int MajorityElement(int []arr){

        return 0;

    }
    
}
