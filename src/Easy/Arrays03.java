// check if the array is sorted

package Easy;

public class Arrays03 {
    static int checkSorted(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i - 1] > arr[i]) {
//                System.out.println("not sorted element found hence array is not sorted");
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 8, 16, 36};
        int result = checkSorted(arr);
        System.out.println(result);
    }
}
