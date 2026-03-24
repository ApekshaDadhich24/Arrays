// optimal approach for left rotate array

package Easy;
public class Arrays08 {

    static void reverse(int []arr,int start ,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void leftRotate(int[]arr,int n , int k){
        reverse(arr,0,n-k-2);
        reverse(arr,n-k-1,n-1);
        reverse(arr,0,n-1);
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        leftRotate(arr,n,k);
    }
}
