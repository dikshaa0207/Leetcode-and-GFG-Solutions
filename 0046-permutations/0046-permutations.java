class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        perm(nums, 0);
        return res;
    }

    void perm(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            res.add(list);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
            perm(nums, i + 1);
            t = nums[i]; nums[i] = nums[j]; nums[j] = t;
        }
    }
}