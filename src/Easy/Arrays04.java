//Remove duplicates from the array

package Easy;
import java.util.ArrayList;
public class Arrays04 {
    static void removeDuplicate(int[]arr, ArrayList<Integer> list){
      list.add(arr[0]);
      System.out.print(arr[0]);
        for (int i = 1 ; i < arr.length ; i ++){
            if (arr[i]!=arr[i-1]){
                list.add(arr[i]);
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,4,5,7,7,9};
        ArrayList<Integer>list=new ArrayList<>();
        removeDuplicate(arr,list);

    }
}
