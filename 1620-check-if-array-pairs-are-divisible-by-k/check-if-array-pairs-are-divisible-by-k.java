class Solution {
    public boolean canArrange(int[] arr, int k) {
        int mp[]=new int[k];
        for(int x:arr){
            int rem = (x%k+k)%k;
            mp[rem]++;

        }
        if(mp[0]%2 != 0)
        return false;
        for(int r = 1;r<= k/2;r++){
            int counterhalf = k - r;
            if(mp[counterhalf] != mp[r])
            return false;
        }
        return true;
        
    }
}