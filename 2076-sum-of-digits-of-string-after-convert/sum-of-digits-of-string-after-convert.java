class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            str.append(Integer.toString(ch-'a'+1));
        }
        String st = str.toString();
        int sum =0;
        
        while(k>0)
        {
            sum=0;
            for(char ch:st.toCharArray()){
                sum+=(ch-'0');
            }
            k--;
            st = Integer.toString(sum);
        }
        int ans = Integer.parseInt(st);
        return ans;
    }
}