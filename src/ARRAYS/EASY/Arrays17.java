//Maximum consecutive ones

package ARRAYS.EASY;

public class Arrays17 {

    static void maxConsecutive(int [] nums){
        int maxi=0;
        int count  = 0 ;
        for (int i =0 ; i < nums.length ; i ++){
            if(nums[i]==1) {
                count++;
                maxi = Math.max(maxi, count);
            }else {
                count =0;
            }
        }
        System.out.println(maxi);

    }

    public static void main(String[] args) {
        int[]nums = {1,1,0,1,1,1,1,0,1,1,1};
        maxConsecutive(nums);
    }
}
