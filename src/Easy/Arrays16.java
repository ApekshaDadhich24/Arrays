//missing number --xor appraoch

package Easy;
public class Arrays16 {

    static int missingvalue(int[]nums){
        int n = nums.length-1;
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0 ; i < n; i++){
            xor2 = xor2^nums[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ (n+1);
       return xor1^xor2;

    }

    public static void main(String[] args) {
        int[]nums = {1,2,4,5};
        int result = missingvalue(nums);
        System.out.println(result);
    }


}
