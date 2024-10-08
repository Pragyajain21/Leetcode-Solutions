class Solution {
    public int minSwaps(String s) {
        int n =s.length();
        int close=0;
        int maxclose = 0;

        for(char ch:s.toCharArray()){
            if(ch == '[')
            close--;
            else
            close++;
            maxclose = Math.max(close,maxclose);
        }
        return (maxclose+1)/2;
        
    }
}