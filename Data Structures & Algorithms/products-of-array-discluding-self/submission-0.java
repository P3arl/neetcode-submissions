class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] p = new int[nums.length];
        // for(int i=0;i<nums.length;i++) {
        //     int prod = 1;
        //     for(int j=0;j<nums.length;j++) {

        //         if(i != j) {
        //             prod = prod*nums[j];
        //         }
        //     }
        //     p[i] = prod;
        // }

        int n = nums.length;
        int[] preProd = new int[n];
        preProd[0] = 1;

        for(int i=1;i<nums.length;i++) {
            preProd[i] = preProd[i-1]*nums[i-1];
        }

        int[] suffProd = new int[nums.length];
        suffProd[n-1] = 1;
        for(int i=n-2;i>=0;i--) {
            suffProd[i] = suffProd[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++) {
            p[i] = preProd[i]*suffProd[i];
        }
        return p;
    }
}  
