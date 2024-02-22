package Loops;

public class fr {
    public static void main(String[] args) {
        int i=1;
        // Intsted of this for(i=1;i<=10;i++) we can use the below command as well
        for(;i<=10;){
            System.out.println(i);
            i++;
        }  
System.out.println("    ");
        int index=0;
        String [] fruit={"Mango","Bananna","Apple","Orange"};
        int Length=fruit.length;
        for(index=0;index<Length;index++){
            System.out.println("My Fav Fruit Is:-"+fruit[index]);
        }
        System.out.println("I'm Outside of the for loop");

        
    }
    
}
