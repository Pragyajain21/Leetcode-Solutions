class Solution {
    public int maximumSwap(int num) {
        String s = Integer.toString(num);
        char array[] = s.toCharArray();
        int arr[]=new int[10];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'0']=i;
        }
        outerloop:
        for(int i=0;i<s.length();i++){
            for(int j=9;j>=0;j--){
                if(arr[j]!= -1 && j>(s.charAt(i)-'0') && arr[j]>i){
                    char temp = array[i];
                    array[i]=array[arr[j]];
                    array[arr[j]]=temp;
                    break outerloop;
                }
            }
        }
        s = new String(array);
        int ans = Integer.parseInt(s);
        return ans;

    }
}