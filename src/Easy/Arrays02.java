// second largest number of array
package Easy;

import java.sql.SQLOutput;

public class Arrays02 {
    static void secondLargestNum(int[]arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length-1;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        if (secondLargest==Integer.MIN_VALUE){
            System.out.println("no second largest element exists");
        }else{
            System.out.println(secondLargest);
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
    public static void main(String[] args) {
        int []arr = {7,7,7};
        secondLargestNum(arr);
    }
}


