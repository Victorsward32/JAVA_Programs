
public class insertionsrt {
    public static void Printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");

        }
        System.out.println();
    }
    public static void main () {
        int arr[]={7,8,1,3,2};
        //insertion sort 
        for (int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[i]){
                arr[j+1]=arr[j];
                j--;

            }


        }

    Printarray(arr);
    }
}
