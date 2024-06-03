public class SingleNumber {
    public static void main(String[] args) {
        int []nums={2,2,3,1,3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int [] nums){
        int values=0;
        for(int i=0;i<nums.length;i++){
            values=values^nums[i];
        }
        return values;

    }
}
