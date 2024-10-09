class Solution {
    public int minAddToMakeValid(String s) {
        int open_cnt = 0;
        int res = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            open_cnt++;
            else
            {
                if(open_cnt==0)
                res+=1;
                open_cnt = Math.max(open_cnt-1,0);
            }
        } 
        return res+open_cnt;
        
    }
}