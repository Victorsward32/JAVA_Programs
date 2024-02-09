package BitManipulation;
//Example of set bit

public class SetBit {
    public static void main(String[] args) {
        System.out.println("set the second bit (position = 1)of a number n. n(0101)");
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int newNumber= bitmask | n ;
        System.out.println(newNumber);
    }
    
}
