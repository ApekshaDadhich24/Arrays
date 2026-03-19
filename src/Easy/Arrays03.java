// check if the array is sorted

package Easy;

public class Arrays03 {
    static void checkSorted(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("not sorted element found hence array is not sorted");
                return;
            }
        }
        System.out.println("array is sorted !! ");

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 8, 16, 36};
        checkSorted(arr);
    }
}
