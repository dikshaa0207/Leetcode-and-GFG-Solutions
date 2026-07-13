import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        for (int len = lowLength; len <= highLength; len++) {
            for (int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(digits.substring(i, i + len));

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}