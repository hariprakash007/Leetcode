class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        int count  = 0;

        for (int i = 0; i<nums.length; i++)
        {
            if(count == 0 || nums[i] == nums[i-1])
            {
                count++;
                continue;
            }

            if(nums[i] != nums[i-1])
            {
                if (count % 2 == 1) return false;
                count = 1;
            }
        }

        return count % 2 == 0;
    }
}