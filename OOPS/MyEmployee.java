package OOPS;

public class MyEmployee {
    public static void main(String[] args) {
       int n=5;
       pattern5(n);
       pattern(n);

    }
    
    static void pattern(int n){
        for (int i = 0; i < 2*n; i++) {
            int tot_col1=i>n ? 2*n-i:i;
            int space2=n-tot_col1;
            for (int s = 0; s < space2; s++) {
                System.out.print(" ");
                
            }
           for (int j = 0; j < tot_col1; j++) {
            System.out.print("* ");
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
}
