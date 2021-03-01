class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = {1, 1};
        boolean isSolved = false;
        int arrayLength = nums.length;
        List<Integer> numsList = IntStream.of(nums).boxed().collect(Collectors.toList());
        for (int item : nums) {
                int index = numsList.indexOf(item);
                int indexToAdd = index + 1;
                while ((indexToAdd < arrayLength) && !isSolved) {
                    if (item + nums[indexToAdd] == target) {
                        solution[0] = numsList.indexOf(item);
                        solution[1] = indexToAdd;
                        isSolved = true;
                    } else {
                        indexToAdd++;
                    }
                }
            };
        return solution;
    }
}
