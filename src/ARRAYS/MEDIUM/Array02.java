// two sum - most optimal approach

package ARRAYS.MEDIUM;
import java.util.*;
public class Array02 {

    static void twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                System.out.println(nums[left] + " " + nums[right]);
                return;
                }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        twoSum(nums, target);
    }
}


