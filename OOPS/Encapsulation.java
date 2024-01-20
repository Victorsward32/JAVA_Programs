package OOPS;
// Encapsulation in java is a Mechanism of Wrapping the data (variable)and Code acting on the data(Methods) together as a single unit 
public class Encapsulation {
    public static void main(String[] args) {

        Employee Value=new Employee();
        Value.SetEmpdata(32,"Sumit",10000);
        System.out.println(Value.getEmpdata());

    }
    
}


// this the data hiding process
class Employee{

    private int  Empid;
    private String EmpName;
    private int Salary;
    public void SetEmpdata(int eid,String name,int waige){
       Empid=eid;
       EmpName=name;
       Salary=waige;


    }
    public Object getEmpdata(){
        System.out.println("**Employee Data**");
        return "Employee ID: " + Empid + "\nEmployee Name: " + EmpName+ "\nSalary: " + Salary;
    }



}
