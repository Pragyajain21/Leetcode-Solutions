class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     HashMap<String,Integer> map = new HashMap<>();
     List<String> list = new ArrayList<>();

     String arr1[] = s1.split(" ");
     String arr2[] = s2.split(" ");
     for(String s: arr1){
        map.put(s,map.getOrDefault(s,0)+1);
     }
     for(String s:arr2){
        map.put(s,map.getOrDefault(s,0)+1);
     }
     for(Map.Entry<String,Integer>entry:map.entrySet()){
        if(entry.getValue()==1){
            list.add(entry.getKey());
        }
     }
     String ans[]= list.toArray(new String[0]);
     return ans;
    }
}