import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by Administrator on 2018/11/1.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        int closest = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(closest - target))
                    closest = sum;
                if (sum<=target)l++;
                else r--;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        //-3 0 1 2
        int[] nums = {1,1,-1,-1,3};
        int i = new ThreeSumClosest().threeSumClosest(nums, -1);
        System.out.printf("i= " + i);

    }
}
