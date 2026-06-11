class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarysearch(0,nums.length-1,nums,target);
    }
    public int binarysearch(int first, int last, int[] nums, int target){



        // the number if not found will et inserted in left(first) position only
        if(first>last){
            return first;
        }
        int m = first + (last - first) / 2; //first + (last+first): to protect integer overflow / 2

        if(nums[m] == target){
            return m;
        }
        if(nums[m] < target){
             return binarysearch(m+1,last,nums,target);
        }
        else{
            return binarysearch(first,m-1,nums,target);
        }
    }
}