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
        System.out.println(data2.Emp_id+" "+data2.Emp_name);

    }
    
}
class abc{
    
//    parameterized constructor 
    int Emp_id;
    String Emp_name;

    public abc(int Emp_id,String Emp_name){
        this.Emp_id=Emp_id;
        this.Emp_name=Emp_name;

    }

}
  