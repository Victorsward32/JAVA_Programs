package array;
import java.util.*;

public class TwoDArray {
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
     int row=sc.nextInt();
     int col=sc.nextInt();

      int[][] num__arr=new int[row][col];
// fetching input from user
        //this loops run for row
      for(int i=0;i<row;i++){
        //this loops run for columns
        for(int j=0 ; j<col;j++){
            num__arr[i][j]=sc.nextInt();
            // here our i is row no and j is col no
            // 
            // System.out.print();
        }
        System.out.println();
      }
    //   output 
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
           System.out.print(num__arr[i][j]+" ");

        }
        System.out.println();
        

    }


//     for(int i=0;i<row;i++){
//         num__arr[i][i]=i+1;
//         for(int j=0;j<col;j++){
//            System.out.print(num__arr[i][j]+" ");

//         }
//         System.out.println();

//     }


//     //  System.out.println(row+"enter the value");
//     //       System.out.println(col+"enter the value");
          
 }
   
    
}
