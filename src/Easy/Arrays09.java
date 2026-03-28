//Move zeroes to end such that the relative position of other elements is unaltered

package Easy;
import java.util.Arrays;
public class Arrays09 {

    static int[] moveZeroToEnd(int[]nums){
        int j = 0;
        for (int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while (j<nums.length){
            nums[j]=0;
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {1,0,3,5,0,1,0,4};
        int arr[]=moveZeroToEnd(nums);
        System.out.println(Arrays.toString(arr));
    }

}
