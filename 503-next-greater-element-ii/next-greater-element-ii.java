class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int nge[]=new int[n];

        for(int j=2*n - 1;j>=0;j--){
            while(!st.isEmpty() && st.peek()<=nums[j%n]){
                st.pop();
            }
            if(j<n){
                if(st.isEmpty())
                nge[j]=-1;
                else
                nge[j]=st.peek();
            }
            st.push(nums[j%n]);
        }
        return nge;


    }
}