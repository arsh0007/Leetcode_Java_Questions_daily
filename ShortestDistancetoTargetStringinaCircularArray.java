class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int res=Integer.MAX_VALUE;
        for(int i=0; i<words.length; i++)
        {
            if(words[i].equals(target))
            {
                int d = Math.abs(i-startIndex);
                res=Math.min(res,d);
                res=Math.min(res, words.length-d);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
