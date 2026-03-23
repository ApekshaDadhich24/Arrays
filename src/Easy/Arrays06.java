// Left rotate array by one

package Easy;
import java.util.Arrays;
public class Arrays06 {

    static int[] leftRotate(int[] arr) {
            int temp = arr[0];
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n-1] = temp;
            return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int [] result = leftRotate(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
        }
}

