package BitManipulation;

public class swaping {
    public static void main(String[] args) {
        int a=5;
        int b=10;
// we can use the Xor Bitmanupulation
        a=a^b;
        /*
        a=5   0 1 0 1
        b=10  1 0 1 0
             ----------
              1 1 1 1
         */
        b=a^b;
         /*
        a=15   1 1 1 1
        b=10   1 0 1 0
             ----------
               0 1 0 1
         */
        a=a^b;
        /*
        a=15   1 1 1 1
        b=5    0 1 0 1
             ----------
               1 0 1 0
         */

        System.out.println("a="+a+" "+"b="+b);
    }
    
}
