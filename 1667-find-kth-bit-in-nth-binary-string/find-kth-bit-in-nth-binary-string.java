class Solution {
    public String reverse(String s)
    {
        int i=0;
        int j = s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
        char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        s= new String(arr);
        return s;
    }
    public String invert(String s){
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            arr[i]='1';
            else
            arr[i]='0';
        }
        s = new String(arr);
        return s;
    }
    public String recur(int n){
        if(n==1)
        return "0";
        String s = recur(n-1);
        return s +"1" + reverse(invert(s));
    }
    public char findKthBit(int n, int k) {
        String ans = recur(n);
        return ans.charAt(k-1);

    }
}