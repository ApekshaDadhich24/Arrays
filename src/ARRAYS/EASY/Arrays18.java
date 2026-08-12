//max consecutive ones -- most optimal appraoch

package ARRAYS.EASY;
public class Arrays18 {

    static int maxConsecutive(int[]nums){
        int xor = 0;
        for(int i = 0 ; i < nums.length ; i++){
            xor = xor^nums[i];
        }return xor;
    }

    public static void main(String[] args) {
        int []nums ={1,1,2,2,3,4,4,5,5};
        int result= maxConsecutive(nums);
        System.out.println(result);
    }
}
