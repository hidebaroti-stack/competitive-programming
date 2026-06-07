import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        //Create an empty set to store data
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) {
                return true; //Duplicate found
            }
            set.add(num);//Otherwise add it to the set
        }
        return false;//No duplicate found
    }
}