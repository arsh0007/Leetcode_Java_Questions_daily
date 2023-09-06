class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int count = 0;
        for(int i = low; i <= high; i++)
        {
            if(symmentric(i))
            {
                count++;
            }
        }
        return count;
    }
    public boolean symmentric(int n){
        String s = String.valueOf(n);
        int len = s.length();

        if(len%2==1)
        {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mid = len/2;
        for(int i = 0; i < mid; i++)
        {
            sum1 += s.charAt(i)-'0';
            sum2 += s.charAt(len-i-1)-'0'; 
        }
        return sum1 == sum2;

    }
}
