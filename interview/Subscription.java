package interview;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Question is check the customer is under our subscription or not


public class Subscription {
    
    public static void main(String[] args) throws ParseException  {
       
         Scanner sc=new Scanner(System.in);
    Date today=new Date();

    // Get the staring date and ending date
    String SatringDate="2022-01-01";
    String EndingDate="2024-12-31";

    // use parser method here to fetching date from String

    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    Date STARTD=sdf.parse(SatringDate);
    Date ENDD=sdf.parse(EndingDate);


    // conditions for checking the under subscription or not
    if (today.after(STARTD)&&today.before(ENDD)) {
        System.out.println("user under subscription ");
        System.out.println("thanks");
    } else {
        System.out.println("user subscription is expired");
        System.out.println("check out our new plans below");
    }
    }
   
}
