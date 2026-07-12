class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int[] newNums = nums;

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(newNums, 0, result, nums.length, newNums.length);
        System.out.println(Arrays.toString(result));
        return result;
    }
}