package Exception;
// Its the example of the runtime exeception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RuntimeException {
    public static void main(String[] args)  {
       // checked Exception because it can handle by compile time  
         try {
            FileInputStream file=new FileInputStream("C:\\Users\\Sumit Jadhav\\Documents\\GitHub\\JAVA_Programs\\interview\\armstrong.java");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        //rthis is also a form of unchecked exception 
        int a=100,b=0, c;
        c=a/b;
        System.out.println("Realtime Exception or Unchecked Exception"+c);
    }
    
}
