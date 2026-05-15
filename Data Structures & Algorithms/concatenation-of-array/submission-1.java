class Solution {
    public int[] getConcatenation(int[] nums) {
        int answer[] = new int[2*nums.length];
        int indexx = 0;
        for(int i=0 ; i<nums.length ; i++){
            answer[indexx] = nums[i];
            indexx++;
        }
        int index = nums.length;
        for(int i=0 ; i<nums.length; i++){
            answer[index] = nums[i];
            index++;
        }
        return answer;
    }
}