package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        System.out.println("Clear the 3rd bit (Position = 2) of a number n. (n=0101)");
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~bitmask;
        int newno=n & notbitmask;
        System.out.println(newno);
    }
    
}
