// 数组中重复的数字

// 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
// 输入：[2, 3, 1, 0, 2, 5, 3]
// 输出：2 或 3

public class Question03 {
    // 时间复杂度 O(n)，空间复杂度 O(n)，其中 n 是数组 nums 的长度
//    private Integer func(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                return num;
//            }
//            map.put(num, 1);
//        }
//        return null;
//    }

    // 时间复杂度 O(n)，空间复杂度 O(n)，其中 n 是数组 nums 的长度
//    private Integer func(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
//        return null;
//    }

    // 时间复杂度 O(n)，空间复杂度 O(1)，其中 n 是数组 nums 的长度
    private Integer func(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return null;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        Question03 question = new Question03();
        Integer result = question.func(nums);
        System.out.println(result);
    }
}
