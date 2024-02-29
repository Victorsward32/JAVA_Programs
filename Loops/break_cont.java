package Loops;

public class break_cont {
    public static void main(String[] args) {
        // break
        // the break statement is used to jump out of the loop.
        //the break statement is used in the switvh case as well.

        // Continue 
        // the continue statement is used to brak just one iteration.
        // It skips the code line after the continnue Statment for thr  one iteration.

        String [] fruit={"Apple","Banana","Orange","Mango","Pineapple","Grapes","Kiwi","Lemon"};
        boolean val=true;

        // for(String fruits: fruit){
        //     if (val) {
        //         break;
                
        //     }
        //     System.out.println(fruits);
        // }
        // System.out.println("I'm Outside of the loop");

        for(String fruits: fruit){
            if(fruits=="kiwi"){
                continue;
            }
            System.out.println(fruit);
        }
        System.out.println("Im Outside of the loop");
 
    }
    
}
