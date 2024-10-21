class Solution {
     int maxCount = 0;
    public void solve(int i,HashSet<String> set,int currCount,String s){
        if(currCount + (s.length()-i)<=maxCount){ 
            return ; // pruning
        }
       if(i>=s.length())
       {
        maxCount = Math.max(maxCount,currCount);
        return; 
       }
       for(int j=i;j<s.length();j++)
       {
        String sub = s.substring(i,j+1);
        if(!set.contains(sub))
        {
            set.add(sub); // DO
            solve(j+1,set,currCount+1,s); // Explore
            set.remove(sub);
        }
       }
    }
    public int maxUniqueSplit(String s) {
       
        int currCount = 0;
        HashSet<String> set = new HashSet<>();
        solve(0,set,currCount,s);
        return maxCount;
    }
}