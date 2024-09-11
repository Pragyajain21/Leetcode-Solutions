class Solution {
    public String removeDuplicateLetters(String s) {
       int lastIndex[]=new int[26];
       boolean taken[]=new boolean[26];
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        lastIndex[ch-'a']=i;
       }
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        char ch =s.charAt(i);
        if(taken[ch-'a']==true)
        continue;

        while(!st.isEmpty() && st.peek()>ch && lastIndex[st.peek()-'a']>i)
        {
           taken[st.peek()-'a']=false;
           st.pop();
        }
        st.push(ch);
        taken[ch-'a']=true;
         
       }
       String ans = "";
       while(!st.isEmpty()){
        ans = st.pop()+ans;
       }
       return ans;
    }
}