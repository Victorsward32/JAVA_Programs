package pattern;

public class pattern {
    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
    }
    static void pattern1(int n){
        for (int row = 1; row <n ; row++){
            for (int col = 1; col <=row; col++) 
            {
                System.out.print("* ");
            }
        
            System.out.println();
    }
     for (int row = 1; row <=n ; row++){
            for (int col = 1; col <=n+1-row; col++) 
            {
                System.out.print("* ");
            }
        
            System.out.println();
    }



    }

    static void pattern2(int n){
        for (int row=1; row<=n; row++){
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");

                
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for(int row=1; row <= 2*n; row++){
            int total_col=row>n ? row:2*n-row;
            for(int col=1; col<total_col;col++){

                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattern4(int n){
        for(int row=1; row <= 2*n; row++){
            int total_col=row>n ? 2*n-row:row;
            for(int col=1; col<total_col;col++){

                System.out.print(col);
            }
            System.out.println();
        }
        
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int tot_col=row > n ? 2*n-row:row;
            int space=n-tot_col;
            for(int spx=0;spx<space;spx++){
                System.out.print(" ");
            } 
            for (int col = 0; col <tot_col; col++) {
             System.out.print("* ");   
            }
         System.out.println();   
        }
    }
    // static void pattern5(int n){
    //     for (int i = 0; i < 2*n; i++) {
    //         int tot_col1=i>n ? 2*n-i:i;
    //         int space2=n-tot_col1;
    //         for (int s = 0; s < space2; s++) {
    //             System.out.print(" ");
                
    //         }
    //        for (int j = 0; j < tot_col1; j++) {
    //         System.out.print("* ");
    //        } 
    //        System.out.println();
    //     }

    // }

    static void pattern6(int n){
        for (int row=1;row<=n;row++) {
            int total_col= row>n ? 2*n-row:row;
            int space=n-total_col;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=total_col;col++) {

                System.out.print("* ");
                
            }
            System.out.println( );
        }
    }
    static void pattern7(int n){
        for (int row=1;row<=n;row++) {
            int total_col= row>n ? 2*n-row:row;
            int space=n-total_col;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=total_col;col++) {

                System.out.print(col+" ");
                
            }
            System.out.println( );
        }
 
    }

    static void pattern8(int n){
        for (int row=1;row<=2*n;row++) {
            int total_col= row>n ? 2*n-row:row;
            int space=n-total_col;
            for(int s=0;s<=space;s++){
                System.out.print("  ");
            }
            for (int col=total_col ;col>= 1;col--)  {
                System.out.print(col+" ");
                
            }
            for (int col=2;col<= total_col;col++) {

                System.out.print(col+" ");
                
            }
            System.out.println( );
        }
    }

    static void pattern9(int n){
        for (int row=0;row<=2*n;row++){
            
            for(int col=0;col<=2*n;col++){
                 int Eve_ind=Math.max(Math.max(row,col),Math.max(n-row,n-col));
                System.out.print(Eve_ind+" ");

            }
            System.out.println();
    }

}
}
