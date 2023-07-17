class Solution 
{
    public int fib(int n) 
    {
       int a = 0; 
       int b = 1;
       int count = 2;
       int fib=0;
       if(n==0 || n==1) return n;
       while(count <= n)
       {
           fib= a+b;
           a=b;
           b=fib;
           count++;
       }
       return fib;
    }
}
