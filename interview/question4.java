package interview;

public class question4 {
    
    public static void main(String[] args) {
        int n=4;
        int [] []mat=new int[n][n];
        for (int i = 0; i <n; i++) {
            mat[i][i]=i+1;
            
        }
        for(int row=0;row<n;row++){
            for (int col=0;col<n;col++) {
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}

