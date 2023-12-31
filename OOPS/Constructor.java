package OOPS;

public class Constructor {
//    Default constructor
    int x;
    String y; 

    public Constructor(){
        System.out.println("No argument constructor");
    }
    public static void main(String[] args) {
        //    Default constructor
        Constructor data= new Constructor();
        System.out.println(data.x+" "+data.y);

        abc data2= new abc(12,"ABCD");
        System.out.println(data2.z+" "+data2.name);

    }
    
}
class abc{
    
//    parameterized constructor
    int z;
    String name;

    public abc(int x,String name){
        this.z=z;
        this.name=name;

    }

}
  