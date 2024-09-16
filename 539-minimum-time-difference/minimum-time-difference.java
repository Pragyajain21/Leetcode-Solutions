class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int arr[]=new int[n];
        int i=0;
        for(String s: timePoints){
            int hour = Integer.parseInt(s.substring(0,2));
            int min = Integer.parseInt(s.substring(3,5));
            int tm = (hour * 60) + min ;
            arr[i++] = tm;
        }
        Arrays.sort(arr);
        int mindiff = arr[1]-arr[0];
        for(int j=1;j<n-1;j++){
            mindiff = Math.min(mindiff,arr[j+1]-arr[j]);
        }
        return Math.min(mindiff,1440 - arr[n-1]+arr[0]);
    }
}