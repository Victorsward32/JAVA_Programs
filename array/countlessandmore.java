package array;

public class countlessandmore {
    
    public static void main(String[] args) {
        int[]arr={1,4,6,22,45,67,8,20};
        int num=21;
        int mincount=0;
        int maxcount=0;

        System.out.println("Number of element which are less than "+num+" is:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=num){
                System.out.print(arr[i]);
                mincount++;

            }
            System.out.println();
            
        }
        System.out.println("Number of element which are more than "+num+" is:");  

        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                System.out.print(arr[i]);
                maxcount++;

            }
            System.out.println();
            
        }

        System.out.println("minimum count of apperance is "+mincount);
        System.out.println("Maximum count of apperance is "+maxcount);
   
   
   
    }

}
