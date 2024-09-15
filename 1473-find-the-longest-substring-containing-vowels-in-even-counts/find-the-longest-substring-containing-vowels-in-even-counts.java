class Solution {
    
    public int findTheLongestSubstring(String s) {
        HashMap<String , Integer> map = new HashMap<>();
        int vowel[]=new int[5];
        String currState = "00000";
        map.put(currState,-1);
        int res = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'){
                vowel[0] = (vowel[0]+1)%2;
            }
            else if(ch=='e'){
                vowel[1]= (vowel[1]+1)%2;
            }
            else if(ch=='i'){
                vowel[2]= (vowel[2]+1)%2;
            }
            else if(ch=='o'){
                vowel[3]= (vowel[3]+1)%2;
            }
            else if(ch=='u'){
                vowel[4]= (vowel[4]+1)%2;
            }
            currState ="";

            for(int j=0;j<5;j++){
                currState+=Integer.toString(vowel[j]);
            }
            if(map.containsKey(currState)){
                res = Math.max(res,i-map.get(currState));
            }
            else
            map.put(currState,i);


        }
        return res;
    
    }
}