class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> binnacle = new HashMap<>();
        int[] indexes = new int[2];
        int rest = 0;

        for (int i = 0; i < nums.length; i++) {
            rest = target - nums[i];

            if (binnacle.containsKey(rest)) {
                indexes[0] = binnacle.get(rest);;
                indexes[1] = i;
                return indexes;
            }
            binnacle.put(nums[i], i);
        }
        return indexes;
    }
}
