class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();
 // Stack operates on LIFO(Last In First Out)
        for(String op : operations){
            if(op.equals("+")){
                int last = result.pop();
                int lastsecond = last + result.peek();
                result.push(last);
                result.push(lastsecond);
            }
            else if(op.equals("D")){
                result.push(2*result.peek());
            }
            else if(op.equals("C")){
                result.pop();
            }
            else{
                result.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
            for(int i : result){
                sum+=i;
            }
        return sum;
    }
}