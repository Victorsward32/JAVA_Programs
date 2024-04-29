package Leetcode;
// A parking Lot in a park has M*N number of Parking spaces Each Parking Space will either be empty (0) or full (1); The status (0/1) of a parking space is represented as the element of the matrix the task is to find the row with have maximum number of cars parked in it.

import java.util.Scanner;

public class carpark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter number of columns:");
        int col=sc.nextInt();
        int[][] inutmatrix= new int[row][col];
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                inutmatrix[i][j]= sc.nextInt();
            }
        }

        //output of matrix 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(inutmatrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            int rowCount = 0;
            for(int j=0;j<col;j++){
                if(inutmatrix[i][j]==1){
                    rowCount++;
                }
            }
            System.out.println("Cars parked in row " + (i+1) + ": " + rowCount);
            count += rowCount;
        }
        System.out.println("Total cars parked: " + count);
    }
}
