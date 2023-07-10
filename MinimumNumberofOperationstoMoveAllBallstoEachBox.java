class Solution {
    public int[] minOperations(String boxes) {
        int answer[] = new int [boxes.length()];
        int count = 0;
        int operations = 0;
        for(int i = 0; i < boxes.length(); i++)
        {
            answer[i]+= operations;
            count+= boxes.charAt(i)-'0';
            operations+= count;
        }
        count = 0;
        operations = 0;
        for(int i = boxes.length()-1; i > -1; i--)
        {
            answer[i]+= operations;
            count+= boxes.charAt(i)-'0';
            operations+= count;
        }

        return answer;
    }
}
