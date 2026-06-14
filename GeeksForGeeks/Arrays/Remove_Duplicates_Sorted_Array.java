import java.util.*;
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return new ArrayList<>(set);
    }
}