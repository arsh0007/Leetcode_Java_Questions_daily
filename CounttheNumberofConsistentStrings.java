class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
  {
        int result = 0;
        for(String s : words) {
            boolean flag = true;
            for(char ch : s.toCharArray()){
                if(!allowed.contains(String.valueOf(ch))){
                    flag = false;
                }
            }
            if(flag) result++;
        }
        return result;
        
    }
}
