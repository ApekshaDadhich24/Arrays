// find the missing number -- brute force

package Easy;
public class Arrays14 {

    static void missingNumber(int [] nums){
        int n = nums.length;
        for (int i = 1 ; i<n ; i++){
            int flag = 0 ;
            for (int j = 0 ; j<n-1 ;j++){
                if (nums[j]==i){
                    flag = 1;
                    break;
                }
            }
            if (flag ==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int []nums ={1,3,4,5,6};
        missingNumber(nums);
    }


}
