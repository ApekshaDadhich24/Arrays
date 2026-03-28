//union of two sorted arrays -- optimal approach

package Easy;

import java.util.*;

public class Arrays12 {

    static void unionArray(int[] n1, int[] n2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1.length && j < n2.length) {
            if (n1[i] <= n2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != n1[i]) {
                    list.add(n1[i]);
                }
                i++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != n2[j]) {
                    list.add(n2[j]);
                }
                j++;
            }
        }
        while (i < n1.length) {
            if (list.size() == 0 || list.get(list.size() - 1) != n1[i]) {
                list.add(n1[i]);
            }
            i++;
        }
        while (j < n2.length) {
            if (list.size() == 0 || list.get(list.size() - 1) != n2[j]) {
                list.add(n2[j]);
            }
            j++;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] n1 = {1, 1, 2, 3, 4, 7};
        int[] n2 = {2, 3, 4, 4, 5, 6};
        unionArray(n1, n2);
    }
}

