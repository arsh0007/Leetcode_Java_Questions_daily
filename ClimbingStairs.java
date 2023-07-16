class Solution {
    public int climbStairs(int n) {
        int a=3, b=2;
        if(n<=3)
        {
            return n;
        }
        for(int i=0; i<n-3; i++)
        {
            a = a+b;
            b = a-b;
        }
        return a;
    }
}
