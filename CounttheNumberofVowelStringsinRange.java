class Solution 
{
    public int vowelStrings(String[] s, int left, int right) 
    {
        int res=0;
        for(int i=left; i<=right; i++)
        {
            if(s[i].charAt(0)=='a'|| s[i].charAt(0)=='e'|| 
               s[i].charAt(0)=='i'|| s[i].charAt(0)=='o'|| 
               s[i].charAt(0)=='u')
            {
                if(s[i].charAt(s[i].length()-1)=='a'|| s[i].charAt(s[i].length()-1)=='e'|| 
                   s[i].charAt(s[i].length()-1)=='i'|| s[i].charAt(s[i].length()-1)=='o'|| 
                   s[i].charAt(s[i].length()-1)=='u')
                {
                    res+=1;
                }
            }
        }
        return res;
    }
}
