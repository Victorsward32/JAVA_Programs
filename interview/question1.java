package interview;
// question 
public class question1 {
    public static void main(String[] args) {
        int n=123;
        int lastvalue;
        int last_result=0;
        int total=0;

        while(n>0){
            lastvalue=n%10;
            last_result=last_result*10+lastvalue;
            n=n/10;
            total=total+lastvalue;

        }

        System.out.println(last_result);
        System.out.println("total="+total);
    }
}
