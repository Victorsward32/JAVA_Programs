package Recurrsion;

public class printsumofnnaturalnumber {

    public static void PrintSum(int i,int n, int sum){

        if(i==n){
            sum +=i;
            System.out.println(sum);

            return;
        } 
        sum+=i;
        System.out.println(sum);
        PrintSum(i+1,n,sum);
    }

    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;

        PrintSum( i, n, sum);
       
    }
    
}
