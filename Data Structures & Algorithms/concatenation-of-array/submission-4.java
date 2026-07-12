class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < nums.length; j++){
                result[j] = nums[j];
                if(i == 1){
                    result[j + nums.length] = nums[j];
                }
            }
        }
        return result;
    }
}