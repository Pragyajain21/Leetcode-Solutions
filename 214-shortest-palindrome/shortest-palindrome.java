class Solution {
    public void solve(int lps[],String news){
        int pre = 0;
        int suf = 1;
        while(suf<news.length())
        {
            if(news.charAt(pre)==news.charAt(suf)){
                lps[suf]= pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre == 0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre = lps[pre-1];
                }
            }
          
        }
      

    }
    public String reverse(String s){
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<=j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return  new String(arr);
    }
    public String shortestPalindrome(String s) {
        int n = s.length();
        String reversed = reverse( s);
        String news = s+"$"+reversed;
        int lps[]=new int[2*n+1];
        solve(lps,news);
        int len = lps[2*n];
        String sub  = s.substring(len);
        String subrev = reverse(sub);
        return subrev+s; 


    }
}