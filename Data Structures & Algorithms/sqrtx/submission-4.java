class Solution {
        public int mySqrt(int x) {
            int left = 1; // Start at 1 to handle potential division edge cases cleanly
            int right = x;
            int res = 0;
            while(left<=right){
                int mid = left + (right - left) / 2;
                

                long sqr = (long)mid*mid; // In Java, operations happen from the inside out. Because mid is an int, 
                                           //  Java multiplies mid * mid as an int first. If mid is large (e.g., 46341), mid * mid will overflow the maximum limit of an integer and become a negative number before the (long) cast ever happens.
                                        // This happened becaude (long)(mid*mid) due to parenthesis: Java will multiply mid * mid as an int before converting it to a long
                if ((sqr) > x){
                    right = mid - 1;
                }
                else if((sqr) < x){
                    left = mid + 1;
                    res = mid;     // Since integers cannot hold decimals, res = mid is 
                                  //  your way of saying: "In case I don't find a perfect square later on, remember this current number as the closest floor value."
                }
                else{
                    return mid;
                }
            }
            return res;
        }
}