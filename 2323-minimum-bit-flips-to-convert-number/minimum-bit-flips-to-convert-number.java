class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start^goal;
        int cnt = 0;
        while(xor>0){
            if((xor & 1)==1)
            cnt++;
            xor =xor>>1;
        }
        return cnt;
    }
}