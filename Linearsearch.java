import java.util.*;
public class Linearsearch{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,45,667,8996,33,34,56,78,5,6};
    System.out.println("Enter the key for searching");
    int key=sc.nextInt();
    boolean keyFound= false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==key){
            keyFound= true;
            break;

        }
        }
        if(keyFound){
            System.out.println("key found successfully"+key);

        }
        
        else{
            System.out.println("key is not present");
        }   
}
}