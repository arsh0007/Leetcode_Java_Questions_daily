class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++)
        {
            String s = words[i];
            String rev = s.charAt(1)+""+s.charAt(0);
            for(int j=i+1; j<words.length; j++)
            {
                if(words[j].equals(rev))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
