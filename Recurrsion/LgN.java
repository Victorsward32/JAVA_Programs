package Recurrsion;

public class LgN {
    public static int Largest_N(int []Num,int index){
        if(index == 0){
            return Num[0];

        }else{
            int restmax=Largest_N(Num, index-1);
            return Math.max(Num[index],restmax);
        }
    


    }
    public static void main(String[] args) {
        int[] Num={7,5,1,2,3};
        int  large_num=Largest_N(Num,Num.length-1);
        System.out.println(large_num);

        
    }
    
}
