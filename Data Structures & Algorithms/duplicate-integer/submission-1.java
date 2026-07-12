class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result;

        for (int i = 0; i < nums.length; i++){
            if(checkDuplicate(nums, nums[i], i)){
                return true;
            }
        } 
        return false;
    }

    public boolean checkDuplicate(int[] nums, int currNum, int currIndex){
        for (int i = 0; i < nums.length; i++){
            if (i != currIndex && nums[i] == currNum){
                return true;
            }
        }
        return false;
    }


}