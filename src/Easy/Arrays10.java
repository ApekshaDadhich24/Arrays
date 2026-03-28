// Linear Search

package Easy;
public class Arrays10 {

    static void linearSearch(int[]nums,int target){
        for(int i = 0 ; i < nums.length ; i++){
            if(target==nums[i]){
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,5,6,5,8};
        int target = 5;
        linearSearch(nums,target);

    }

}
