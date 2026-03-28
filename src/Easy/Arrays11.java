//union of two sorted arrays -- brute force

package Easy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Arrays11 {

    static int[] unionArray(int[]num01 , int [] num02){
        Set<Integer> st = new HashSet<>();
        for(int i = 0 ; i<num01.length ;i++){
            st.add(num01[i]);
        }
        for(int i = 0 ; i<num02.length ;i++){
            st.add(num02[i]);
        }
        int[] union = new int[st.size()];

        int i = 0;
        for (int itr : st) {
            union[i] = itr;
            i++;
        }
        return union;
    }

    public static void main(String[] args) {
       int[] num01 = {1,2,2,3,4,5};
       int[] num02 = {4,6,8,9};
       int [] result = unionArray(num01,num02);
       System.out.println(Arrays.toString(result));
    }
}
