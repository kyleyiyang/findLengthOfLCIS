class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==1) return 1;
        else {
            int max=0;
            for (int i=0;i<nums.length-1;i++) {
                int count=1;
                while (i<nums.length-1 && nums[i]<nums[i+1]) {
                    count++;
                    i++;
                }
                if (count>max) {
                    max=count;
                }
            }
            return max;
        }
    }
}
