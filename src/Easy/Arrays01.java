// find the larget element in the array

package Easy;
public class Arrays01 {

    static int largestNum(int[]arr){
        int answer = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            if (arr[i]>answer) {
                 answer = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int []arr = {3,2,1,5,2,7};
        int result = largestNum(arr);
        System.out.println(result);
    }

}
