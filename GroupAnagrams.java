class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0)
        {
            return new ArrayList<>();
        }

        Map<String, List<String>> flag = new  HashMap<>();

        for(String s : strs)
        {
            char t [] = s.toCharArray();
            Arrays.sort(t);
            String key = String.valueOf(t);
            if(!flag.containsKey(key)) flag.put(key, new ArrayList<>());
            flag.get(key).add(s);
        }
        return new ArrayList<>(flag.values());
    }
}
