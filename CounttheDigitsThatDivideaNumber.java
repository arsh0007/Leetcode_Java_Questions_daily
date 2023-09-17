class Solution {
    public int countDigits(int num) {
        int n = num; 
        int count =0; 
        if(num<10) return 1;
        else{
            while(n!=0)
            {
                int rem = n%10;
                if(num%rem==0) count++;
                n /= 10;
            }
        }
        return count;
    }
}
