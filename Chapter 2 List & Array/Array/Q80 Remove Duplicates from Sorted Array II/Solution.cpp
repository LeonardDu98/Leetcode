class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int COUNT_MAX = 2;
        if(nums.size() <= COUNT_MAX){
            return nums.size();
        }
        
        int index = 2;
        
        for(int i = 2; i < nums.size(); i++){
            if(nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
};