class Solution {
    public boolean isFascinating(int n) {
        int second = 2*n; 
        int third = 3*n;
            String s = n+""+second+""+third;
            
            HashSet<Character> h = new HashSet<>();
            int got=1;
            for(int i=0; i<s.length(); i++)
            {
                    h.add(s.charAt(i));
                    if(s.charAt(i)=='0'){
                        got=0;
                    }
            }
            System.out.println(s);
            if(got==0){
                return false;
            }
            else
            {
                    if(h.size()==9 && s.length()==9){
                            return true;
                            
                    }
                    else 
                    {
                            return false;
                    }
            }
        
    }
}
