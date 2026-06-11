class Solution {
    public int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        int right = 0; 
        int left = 0;
        int n = arr.length;
        for(right = 0; right<n; right++){
            int idx = map.getOrDefault(arr[right], -1);
            
            if(idx >= left){
                res = Math.max(res, right - 1 - left + 1);
                left = idx + 1;
            }
            
            map.put(arr[right],right);
        }
        return Math.max(res, right - 1 - left + 1);
    }
}
// a b c a d a b b