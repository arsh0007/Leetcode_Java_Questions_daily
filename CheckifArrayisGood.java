class Solution {
    public boolean isGood(int[] nums) {
        int n = Arrays.stream(nums).max().getAsInt(); 
        if (nums.length != n + 1) 
            return false;

        int[] baseN = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            baseN[i - 1] = i;
        }
        baseN[n] = n; 

        
        for (int num : nums) {
            boolean found = false;
            for (int i = 0; i < baseN.length; i++) {
                if (baseN[i] == num) {
                    baseN[i] = -1; 
                    found = true;
                    break;
                }
            }
                if (!found) {
                return false;
            }
        }

        return true;
    }
}
