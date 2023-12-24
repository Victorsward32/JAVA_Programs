package interview;

public class question3 {
    public static void main(String[] args) {
        String x="I Love Java";
        char[] arr=x.toCharArray();
        String NSP_x="";

        for (int i=0;i<x.length();i++) {
            if(x.charAt(i) !=' '){
                NSP_x=NSP_x+ x.charAt(i);
            }
            
        }
        System.out.print(NSP_x);

//method 2 with array

    //     for (int i=0;i<arr.length;i++) {
    //         if(arr[i]!=' '){
    //             NSP_x=NSP_x+arr[i];

    //         }
            
    //     }
    //     System.out.println(NSP_x);

}


}

