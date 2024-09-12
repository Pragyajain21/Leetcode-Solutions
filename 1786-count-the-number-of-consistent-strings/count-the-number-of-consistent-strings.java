class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

     for(char ch:allowed.toCharArray()){
       set.add(ch);
     } 
     int ans = 0;
     boolean flag = true;
     for(String s:words)
     {
        flag  = true;
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                flag = false;
                break;
            }
        }
        if(flag == true)
        ans++;
     }
     return ans;  
    }
}