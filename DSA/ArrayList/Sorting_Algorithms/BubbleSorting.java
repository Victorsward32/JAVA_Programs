package DSA.ArrayList.Sorting_Algorithms;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] arraylist={39,19,29,12,5};
        int temp;
        for(int i=0;i<arraylist.length;i++){
            int flag=0;
            for(int j=0;j<arraylist.length-1-i;j++){
                if(arraylist[j]>arraylist[j+1]){
                    temp=arraylist[j];
                    arraylist[j]=arraylist[j+1];
                    arraylist[j+1]=temp;

                }
            }
            if(flag==1){
                break; 
            }
        }

        for(int i=0;i<arraylist.length;i++){
            System.out.print(arraylist[i]+" ");
        }
    }
    
    
}



