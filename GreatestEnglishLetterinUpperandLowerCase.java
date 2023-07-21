class Solution 
{
    public String greatestLetter(String s) 
    {
        char ch = 'z', CH= 'Z';

        for(int i=0; i<26; i++)
        {
            if(s.indexOf(ch)!= -1 && s.indexOf(CH) != -1)
            {
                return ""+CH;
            }
            else
            {
                ch--;
                CH--;
            }
        }
        return "";
    }
}
