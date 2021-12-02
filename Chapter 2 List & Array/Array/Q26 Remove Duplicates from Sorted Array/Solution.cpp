class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty()){
            return 0;
        }
        
        int index = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] != nums[index]){
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
};