class Solution {
    public List<Integer> solve(String exp){
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<exp.length();i++){
            char ch  = exp.charAt(i);
            if(ch =='+' || ch=='-' || ch=='*'){
                List<Integer> left = solve(exp.substring(0,i));
                List<Integer> right = solve(exp.substring(i+1));
                for(int x:left){
                    for(int y:right){
                        if(ch == '+'){
                            res.add(x+y);
                        }else if(ch== '*')
                        res.add(x*y);
                        else
                        res.add(x-y);
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.parseInt(exp));
        }
         
       
        return res;
    }

    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
}