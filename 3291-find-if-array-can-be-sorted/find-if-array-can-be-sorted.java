class Solution {
    public int cnt(int n){
        int c = 0;
        while(n!=0){
            c+=1;
            n = n & (n-1);
        }
        return c;
    }
    public boolean samesetbits(int i,int j){
        int s1 = cnt(i);
        int s2 = cnt(j);
        if(s1==s2)
        return true;
        else
        return false;
    }
    public void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n-1-i;j++){
                if(nums[j+1]<nums[j]){
                    if(samesetbits(nums[j+1],nums[j])){
                        swap(nums,j+1,j);
                    }else
                    return false;
                }
            }
        }
        return true;
        
    }
}