package OOPS;


public class objects {

    public static void main(String[] args) {
        //student Detatils
        student cand1 = new student();

        cand1.roll_no=14;
        cand1.marks=52.4f;
        cand1.name="SAMIR";
        System.out.println(cand1.roll_no);

        System.out.println(cand1.marks);
        System.out.println(cand1.name);

         student cand2 = new student();

        cand2.roll_no=24;
        cand2.marks=82.4f;
        cand2.name="RAVI";
        System.out.println(cand2.roll_no);

        System.out.println(cand2.marks);
        System.out.println(cand2.name);

 
        // Teacher details

        teacher teach1 = new teacher();
        teach1.mem_id=788;
        teach1.name="roadrics";
        teach1.Subject="Cnn networks";

        System.out.println(teach1.name);
        System.out.println(teach1.mem_id);
        System.out.println(teach1.Subject);
        
    }
    
}
class student{
        int roll_no;
        String name;
        float marks;
    }

    class teacher{
        int mem_id;
        String name;
        String Subject;
    }