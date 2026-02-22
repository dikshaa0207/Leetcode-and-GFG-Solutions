class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]=new int[2];
        HashMap<Integer,Integer> map=new  HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i)
            {
                ar[0]=i;
                ar[1]=map.get(target-nums[i]);
            }
        }
        return ar;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             ar[0]=i;
        //             ar[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return ar;
    }
}