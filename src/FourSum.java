import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/4sum/
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int tmp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[j] + nums[l] + nums[r];
                    if (sum == tmp) {
                        List<Integer> path = Arrays.asList(nums[i], nums[j], nums[l], nums[r]);
                        res.add(path);
                        while (l < r) {
                            if (nums[l] == nums[l + 1]) {
                                l++;
                            } else break;
                        }
                        while (l < r) {
                            if (nums[r] == nums[r - 1]) {
                                r--;
                            } else break;
                        }
                        l++;
                        r--;
                    } else {
                        if (sum < tmp) {
                            l++;
                        } else {
                            r--;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //1, 0, -1, 0, -2, 2
        //0,0,0,0
        //-3,-2,-1,0,0,1,2,3
        //-1,0,1,2,-1,-4
        //-1,-5,-5,-3,2,5,0,4
        int[] nums = {-1, -5, -5, -3, 2, 5, 0, 4};
        List<List<Integer>> lists = new FourSum().fourSum(nums, -7);
        System.out.println(Arrays.toString(lists.toArray()));
    }
}
