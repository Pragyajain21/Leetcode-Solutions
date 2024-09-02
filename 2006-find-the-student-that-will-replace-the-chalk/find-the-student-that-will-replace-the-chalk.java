class Solution {
    public int chalkReplacer(int[] chalk, int k) {
    long sum = 0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        long rem = k%sum;
        int i=0;
        while(chalk[i]<=rem){
            rem=rem-chalk[i];
            i++;
        }
        return i;
    }
}