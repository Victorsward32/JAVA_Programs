package OOPS;

class A {
    void showA(){
        System.out.println("A class Method");
    }

    int z;
    String name; 

    
     
}
class B extends A{
    void showB(){
        System.out.println("its class B method");
    }

}
// for herichical inheritance class C extends A   
class C extends B{

    void showC(){
        System.out.println("C class method");

    }

    public static void main(String[] args) {
        A obj1=new A();
        obj1.showA();
        // B method
        System.out.println("---------------------------------");
        B obj2= new B();
        obj2.showA();
        obj2.showB();
        // C method
        System.out.println("---------------------------------");
        C obj3=new C();
        obj3.showA();
    //    for herichical inheritance  we habe tp remove below line
        obj3.showB();
        obj3.showC();

    }

}
