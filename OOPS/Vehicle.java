package OOPS;
// Example of Abstraction in java

abstract class Vehicle {
    int tyers;
    abstract void start();
    
}
class car extends Vehicle{
    void start(){
        System.out.println("start with key");

    }

}
class scooter extends Vehicle{
    void start(){
        System.out.println("Start with kick");
    }

    public static void main(String[] args) {
        
        car t=new car();
        t.start();
        scooter t1=new scooter();
        t1.start();
    }

}
