package Leetcode;

import java.util.Arrays;

public class Faircandyswap {
    public static void main(String[] args) {
        int [] aliceSizes={1,1};
        int [] bobSizes={2,2};
        int[] result=faircandyswap_m(aliceSizes, bobSizes);

        System.out.println("Fair Candy Swap"+ Arrays.toString(result));

    }
    public static int[] faircandyswap_m(int[]aliceSizes,int[]bobSizes){
        int A=0;
        int B=0;
// step 1: - to do sumition here
        for(int i=0; i<aliceSizes.length;i++){
            A+=aliceSizes[i];
        }
        for(int i=0; i<bobSizes.length;i++){
            B+=bobSizes[i];
        }

// Apply the formula here 
    for(int a:aliceSizes){
        if((B-A+2*a)%2==0 && (B-A+2*a)/2>=0){
            return new int[]  {a,(B-A+2*a)/2};
        }
    }
    return bobSizes;
       
    }
    
}
