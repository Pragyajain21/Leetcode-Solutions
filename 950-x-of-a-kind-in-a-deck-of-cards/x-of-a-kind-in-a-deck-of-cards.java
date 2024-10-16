class Solution {
    int gcd(int a ,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:deck){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int gcdval = -1;
        for(int val : map.values())
        {
           if(gcdval == -1)
           gcdval = val;
           else
           gcdval = gcd(gcdval,val);
        }
        return gcdval>=2;
    }
}