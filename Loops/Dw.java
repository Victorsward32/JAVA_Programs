package Loops;
// Tutorial about the Do while loop in java
public class Dw {
    public static void main(String[] args) {
        //it return the statment at once even though condition is false
        do{
            System.out.println("its just a first iteration");

        }while(false);
// it will complete work as singleton while loop also
        int index=0;
        String[] fruit={"Apple","Mango","Banana","Orange"};
        int length=fruit.length;
        do{
            System.out.println("My fav Fruit is:- "+fruit[index]);
            index++;

        }
        while(index<length);
    }
    
}
