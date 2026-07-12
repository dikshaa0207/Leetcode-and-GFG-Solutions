import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        
        // Create a copy of the array
        int[] temp = arr.clone();
        Arrays.sort(temp);


        // Store ranks of unique elements
        HashMap<Integer, Integer> rank = new HashMap<>();
        int r = 1;

        for (int num : temp) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }

        // Replace elements with their ranks
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = rank.get(arr[i]);
        }

        return result;
    }
}