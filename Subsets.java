class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> resultList = new ArrayList<>();

        //Backtracking From the beginning.
        backtrack (resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int nums[], int start)
    {
        //Add the set to result set.
        resultSets.add(new ArrayList<>(tempSet));
        for(int i=start; i<nums.length; i++) 
        {
            //Case of include the number.
            tempSet.add(nums[i]);

            //Backtraking the new subset.
            backtrack(resultSets, tempSet, nums, i+1);

            //case of not including the number.
            tempSet.remove(tempSet.size()-1);
        }
    }
}
