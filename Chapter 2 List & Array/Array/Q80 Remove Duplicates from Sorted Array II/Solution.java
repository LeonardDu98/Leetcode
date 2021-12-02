class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int result = 1;
        int times = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[result++] = nums[i];
                times = 1;
            }else if(times == 1){{
                    nums[result++] = nums[i];
                    times++;
                }
            }
        }
        return result;
    }
}