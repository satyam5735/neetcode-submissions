// Most online judges and standard APIs expect a binary search function to take just two arguments: (int[] nums, int target).

// Because your method requires first and last to be passed in from the very outside, whoever calls your function has to manually type:
// solution.search(0, nums.length - 1, nums, target);

// If LeetCode or a testing framework tries to call your function with just solution.search(nums, target);, it will throw a compile-time error because the parameters don't match.

class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(0,nums.length-1,nums,target);
    }

    public int binarysearch(int first, int last, int[] nums, int target){

        if(first>last){
            return -1;
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
