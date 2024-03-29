public class quicksrt {
    public static int partition (int arr[],int  l,int h){
        int pivot=arr[l] ;
        int i=l;
        int j=h;

        while (i<j) {
            
        
        do {
            i++;
        } while (arr[i]<= pivot);
        do {
            j--;
        } while (arr[j]<= pivot);

        if (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }

        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
         }
        return j;

       
    }
    public static void Quicksort(int arr[],int l,int h) {
        if (l<h) {
           int j=partition(arr, l, h);
           Quicksort(arr,l,j);
           Quicksort(arr,j+1, h);
        }
        }
    public static void main(String[] args) {
        int arr[]={10,16,8,12,15,6,3,9,5};

        Quicksort(arr, 0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"sorted array");

        }
        System.out.println();
    }
    
}

