class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();

        for(String word: words )
        {
            prefix.append(word);

            if(prefix.toString().equals(s))
            {
                return true;
            }
        }
        return false;
    }
}
