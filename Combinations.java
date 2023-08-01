class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        if(k>n || k<0)
        {
            return answer;
        }

        if(k==0)
        {
            answer.add(new ArrayList<Integer>());
            return answer;
        }
        answer = combine(n-1, k-1);
        for(List<Integer> list : answer)
        {
            list.add(n);
        }
        answer.addAll(combine(n-1, k));
        return answer;
    }
}
