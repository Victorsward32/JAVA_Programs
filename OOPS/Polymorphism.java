package OOPS;
// method overloding
public class Polymorphism {
    void show(String a,String b){
        a="Method";
        b="overloading";
        System.out.println(a+ " " +b);

    }
    void show(int a){
        a=123;
        System.out.println(a);

    }
    public static void main(String[] args) {
        Polymorphism t=new Polymorphism();
        t.show("mufj","dkhsjfs");


         Polymorphism t2=new Polymorphism();
         t2.show(0);
    }
}
