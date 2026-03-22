//Remove duplicates from the array

package Easy;
import java.util.ArrayList;
public class Arrays04 {
    static int removeDuplicate(int[]nums){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(nums[0]);
        System.out.print(nums[0]);
            for (int i = 1 ; i < nums.length ; i ++){
            if (nums[i]!=nums[i-1]){
                list.add(nums[i]);
                System.out.print(nums[i]);
            }
        }return list.size();
    }

    public static void main(String[] args) {
        int []nums = {1,2,4,5,7,7,9};
        int result = removeDuplicate(nums);
        System.out.println("The unique elements in the array are : "+ result );
    }
}
