//left rotate by k places


package Easy;
public class Arrays07 {

    static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i=k; i<n ;i++){
            nums[i-k]=nums[i];
            System.out.println(nums[i]);
        }
        int j = 0 ;
        for (int i=n-k;i<n;i++){
            nums[i]=temp[j];
            j++;
            System.out.println(nums[i]);
        }
    }
    public static void main (String[]args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(nums,k);
    }
}
