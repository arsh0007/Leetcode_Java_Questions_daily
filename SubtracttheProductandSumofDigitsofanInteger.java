class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            int less = n/10;
            n=less;
            sum +=rem;
            product *= rem;
        }
        return (product-sum);
    }
}
