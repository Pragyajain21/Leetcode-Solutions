class UndergroundSystem {
    HashMap<Integer,Pair<String,Integer>> checkIn;
    HashMap<String,Pair<Integer,Integer>> checkOut;

    public UndergroundSystem() {
        checkIn = new HashMap<>();
        checkOut = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id,new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String,Integer> p = checkIn.get(id);
        String ss = p.getKey();
        int st = p.getValue();
        if(!checkOut.containsKey(ss+"->"+stationName))
        checkOut.put(ss+"->"+stationName,new Pair<>(t-st,1));
        else{
            Pair<Integer,Integer> pp = checkOut.get(ss+"->"+stationName);
            int tot = pp.getKey();
            int cnt = pp.getValue();
            int newtot = tot +( t-st );
            checkOut.put(ss+"->"+stationName,new Pair<>(newtot,cnt+1 ));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String st =  startStation+"->"+endStation;
        Pair<Integer,Integer> p = checkOut.get(st);
        double ans = (double)p.getKey()/p.getValue();
        return ans;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */