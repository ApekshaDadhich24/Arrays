// missing number optimal approach (sum)

package Easy;
public class Arrays15 {

    static void missingvalue(int []nums){
     int n = nums.length+1;
     int sum = n*(n+1)/2;
     int s2 = 0;
     for (int i = 0 ; i<nums.length ; i++){
         s2=s2+nums[i];
     }
     int result = sum - s2;
        System.out.println(result);
    }


    public static void main(String[] args) {
        int[]nums ={1,2,3,5};
        missingvalue(nums);

    }
}
