class Solution {
    public int searchInsert(int[] nums, int target) {
        int index, mark = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                return index;
            }
            mark = nums[i] < target ? mark + 1 : mark;
        }
        return mark;
    }
}