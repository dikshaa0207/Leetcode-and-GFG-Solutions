class Solution {
    public int rob(int[] nums) {
        int previous1 = 0;
        int previous2 = 0;

        for(int num : nums){
            int temp = Math.max(previous1, previous2 + num);
            previous2 = previous1;
            previous1 = temp;
        }

        return previous1;
    }
}