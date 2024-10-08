class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int ans = 0;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.size()==j-i+1){
                ans = Math.max(ans,j-i+1);
            }
            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0)
                    map.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}