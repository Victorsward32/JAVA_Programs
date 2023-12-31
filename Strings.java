import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter Your First Name :-  ");
        // String F_Name= sc.next();
        //  System.out.println("Enter Your Middle Name :-  ");
        // String M_Name= sc.next();
        //  System.out.println("Enter Your Last Name :-  ");
        // String L_Name= sc.next();
        // String C_Name= F_Name+" "+M_Name+" "+L_Name+".";
        // System.out.println("your full name is "+C_Name+" "+C_Name.length());
         


        // for (int i = 0; i < C_Name.length(); i++) {
        //     System.out.println(C_Name.charAt(i));
        // }



        //  in that program we simply remove the Vowels from array
        String []arr={"T","A","P","A","c","A","D","E","M","y"};
        String []Lower_arr=Arrays.copyOf(arr, arr.length);
        String [] Vowels={"a","e","i","o","u"};
        String [] result={};

        for (int i = 0; i < Lower_arr.length; i++) {
            Lower_arr[i]=Lower_arr[i].toLowerCase();
            
        }
        System.out.println(Arrays.toString(Lower_arr));

        for(int i=0 ; i<  Lower_arr.length ;i++){
            boolean isvowel=false;
            for(int j=0; j<  Vowels.length;j++ ){
                if (Lower_arr[i].equals(Vowels[j])){ 
                    isvowel=true;
                    break;
            }
             } 
            if(!isvowel){
                result= Arrays.copyOf(result,result.length +1);
                result[result.length -1]=Lower_arr[i];

            }


                      
        }

        System.out.println(Arrays.toString(result));

    }
    
}
