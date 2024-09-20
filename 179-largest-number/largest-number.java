class Solution {
    public String largestNumber(int[] nums) {
       int n = nums.length;
       String arr[] = new String[n];
       for(int i=0;i<n;i++){
        arr[i]= String.valueOf(nums[i]);
       }
       Arrays.sort(arr,new Comparator<String>()
       {

        public int compare(String a ,String b)
        {
           String o1 = a+b;
           String o2 = b+a;
           return o2.compareTo(o1);
            
        }

       });
        if (arr[0].equals("0")) {
            return "0";
        }
       String ans = "";
       for(int i=0;i<n;i++){
        ans+=arr[i];
    }
    return ans;
    }
}