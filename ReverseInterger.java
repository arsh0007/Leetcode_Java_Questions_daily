class Solution {
    public int reverse(int n) {
        long reverse = 0;
        while(n!=0){
            
            reverse = reverse*10 + n%10;
            n /= 10;
        }
        if(reverse>=Integer.MIN_VALUE && reverse<=Integer.MAX_VALUE)
        {
            return (int)reverse;
        } 
        else{
            return 0;
        }
    }
}
