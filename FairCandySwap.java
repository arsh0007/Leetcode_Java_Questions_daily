class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        int n = aliceSizes.length, m = bobSizes.length;
        int ans[] = new int [2];
        for(int x : aliceSizes) 
        {
            a+= x;
        }
        for(int x : bobSizes) 
        {
            b+= x;
        }
        for(int i=n-1; i>=0; i--) 
        {
            for(int j=m-1; j>=0; j--) 
            {
                int diff = aliceSizes[i] - bobSizes[j];
                if(a-diff==b+diff)
                {
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}
