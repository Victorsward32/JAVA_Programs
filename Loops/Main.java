package Loops;
// tutorial about the while loop 
public class Main {
    public static void main(String[] args) {
         int index=0;
         String[] fruit={"Apple","Banana","Mango","Strrawberry"};
         int length=fruit.length;
         while (length>index) {
            System.out.println("My fav fruit Name is:-"+fruit[index]);
            index++;
           
            
         }
         System.out.println("I am now outside the loops");
    }
    
}
