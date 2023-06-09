class Solution {
    public char nextGreatestLetter(char[] nums, char t) {
        int l = 0, m;
        int h = nums.length-1;
        while (l < h)
        {
            m = (h + l) / 2;
            if(nums[m] <= t)
                l = m + 1;
            else 
                h = m;
        }

        System.gc();
        if(nums[h]>t) return nums[h]; 
        return nums[0];
    }
}
