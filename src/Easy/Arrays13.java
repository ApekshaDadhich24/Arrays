//Intersection of two arrays -- brute force

package Easy;
import java.util.ArrayList;
import java.util.List;
public class Arrays13 {

    static void intersection(int[]n1 , int[]n2){
        List<Integer> list = new ArrayList<>();
        int j =0;
        int i=0;
        while ( i<n1.length && j<n2.length){
            if(n1[i]==n2[j]){
                list.add(n1[i]);
                i++;
                j++;
            }else if (n1[i] < n2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[]n1={1,2,2,3,3,4,5,6};
        int[]n2={2,3,3,5,6,6,7};
        intersection(n1,n2);
    }
}
