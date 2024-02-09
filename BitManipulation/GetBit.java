package BitManipulation;
//get bit example 
public class GetBit {
    public static void main(String[] args) {
        System.out.println("Get third Bit (Position = 2)of a number n(n=5(0101))");
        int n=5;
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("True-Bit Was Zero");

        }else{
            System.out.println("False-Here BIt Was One");

        }
    }
    
}
