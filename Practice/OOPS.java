package Practice;
class pen{

    String name;
    String color;
    String type;
    int price;

    public void write(){
        System.out.println("This is the pen which is used by Writting");
    }

    public void pendetails(){
        System.out.println(this.name+" " +this.color+" " +this.type+" " +this.price);
    }
}

class Student{
    String name;
    int rollno;
    double height;
    int age;

    public void Printinfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.height);
        System.out.println(this.age);
    }

    //constructor



    //non parameterized
    // Student(){
    //     System.out.println("Constructor called");
    // }

// Parametrized constructor
// Student(String name,int rollno,double height,int age){

//     this.name=name;
//     this.age=age;
//     this.rollno= rollno;
//     this.height = height;


//         }

        //Copied construction
        Student(Student s1){
            this.name=s1.name;
            this.rollno=s1.rollno;
            this.height=s1.height;
            this.age=s1.age;
        }
        Student(){

        }

    }

public class OOPS {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.name="Fountain-gripper";
        pen1.color="blue";
        pen1.type="gel";
        pen1.price=15;

        pen1.pendetails();


        Student s1=new Student();
        s1.name="Jhon Doe";
        s1.rollno=12;
        s1.height=6.3;
        s1.age=20;
        //Student s1=new Student("Jhon Doe", 12, 6.3, 17);
        Student s2=new Student(s1;)

        s1.Printinfo();
        
    
    }
    
}
