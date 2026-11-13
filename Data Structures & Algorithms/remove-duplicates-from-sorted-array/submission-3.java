class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l=1, r=1;
        while(r < nums.length) {

            if(nums[r] != nums[l-1]) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}