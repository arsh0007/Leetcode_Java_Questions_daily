class Solution {
    public int countSeniors(String[] nums) {
        int count = 0;
        for(String i: nums)
        {
            if(Integer.parseInt(i.substring(11,13))>60) count++;
        }
        return count;
    }
}
