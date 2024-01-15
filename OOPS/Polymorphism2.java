package OOPS;
// Method overriding
//
public class Polymorphism2 {
    protected String show(String a){
        System.out.println("Hello");
        return null; 
    }

      
}

class xyz extends Polymorphism2{
     public void show(int a){
        System.out.println(1);

    }
    public static void main(String[] args) {
        Polymorphism2 t=new Polymorphism2();
        t.show(null);
        xyz x=new xyz();
        x.show(10);
    }
}
