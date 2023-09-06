class Solution {
    public int balancedStringSplit(String s) {
        int Left = 0, Right = 0, Count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'L')
            {
                Left++;
            }
            else
            {
                Right++;
            }
            if(Left==Right)
            {
                Count++;
            }
        }
        return Count;
    }
}
