class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        perm(nums, 0, set);
        return new ArrayList<>(set);
    }

    void perm(int[] nums, int index, Set<List<Integer>> set) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            set.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            perm(nums, index + 1, set);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}