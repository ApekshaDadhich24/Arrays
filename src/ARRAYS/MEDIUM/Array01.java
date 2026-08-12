//two sum using hashmap

package ARRAYS.MEDIUM;
import java.util.*;
public class Array01 {

    static void twoSum(int[]nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int more = target - nums[i];
            if (map.containsKey(more)){
                System.out.println(map.get(more) + " " + i);
                return;
            }
            map.put(nums[i],i);
        }

    }

    public static void main(String[] args) {
        int[]nums = {2,6,5,8,11};
        int target = 14;
        twoSum(nums, target);

    }

}
