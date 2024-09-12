class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (map.containsKey(check) && map.get(check) != i) {
                return new int[] { i, map.get(check) };
            }
        }

        return new int[] {};
    }
}