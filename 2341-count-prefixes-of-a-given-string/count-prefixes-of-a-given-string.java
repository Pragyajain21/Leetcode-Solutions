class Solution {
    public int countPrefixes(String[] words, String s) {
     int n = words.length;
     HashMap<String,Integer> map = new HashMap<>();

     for(int i=0;i<n;i++){
       map.put(words[i],map.getOrDefault(words[i],0)+1);
     }
     int cnt =0;
     for(int i= 1;i<=s.length();i++){
        String str = s.substring(0,i);
        if(map.containsKey(str))
        cnt+=map.get(str);

     }
     return cnt;


        
    }
}