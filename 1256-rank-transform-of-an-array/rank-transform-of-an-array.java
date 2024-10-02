class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=new int[arr.length];
         int ans[]=new int[arr.length];
         if(arr.length==0)
         return ans;
        for(int i=0;i<arr.length;i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        map.put(copy[0],rank);
        for(int i=1;i<arr.length;i++){
            if(copy[i] != copy[i-1]){
                map.put(copy[i],rank + 1);
                rank++;
            }else{
               map.put(copy[i],rank); 
            }
            
            
        }
       
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}