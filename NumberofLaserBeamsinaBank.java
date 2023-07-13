class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int previous = 0;
       for(String word : bank)
       {
           int current = 0;
           for(int i=0; i<word.length(); i++)
           {    
               if(word.charAt(i)=='1')
               {
                   current++;
               }
           }
           if(current > 0)
               {
                   ans+= previous*current;
                   previous = current;
               }
       }
       return ans;

    }
}
