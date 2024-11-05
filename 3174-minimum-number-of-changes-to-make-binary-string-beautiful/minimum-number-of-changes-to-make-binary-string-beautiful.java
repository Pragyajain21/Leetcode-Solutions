class Solution {
    public int minChanges(String s) {
        int changes = 0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1))
            changes+=1;
        }
        // int count = 0;
        // int changes = 0;
        // char ch = s.charAt(0);
        // int n = s.length();
        // for(int i=0;i<n;i++)
        // {
        //     if(s.charAt(i) == ch)
        //     {
        //         count++;
        //         continue;
        //     }
        //     if(count%2==0)
        //     {
        //         count=1;
        //     }
        //     else
        //     {
        //         count=0;
        //         changes+=1;

        //     }
        //     ch = s.charAt(i);
        // }
        return changes;
    }
}