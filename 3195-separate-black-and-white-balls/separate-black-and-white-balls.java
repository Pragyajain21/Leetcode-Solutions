class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        if(n==1)
        return 0L;
        int i=n-1;
        int cnt = 0;
        long ans = 0;
        while(i>=0)
        {
            if(s.charAt(i)=='0')
            cnt++;
            else
            ans+=cnt;
            i--;
        }
        return ans;
    }
}