import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/11/1.
 */

/**
 * https://leetcode-cn.com/problems/3sum/
 * ThreeSum
 * https://blog.csdn.net/qq_35170267/article/details/81031368
 */

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            int l=i+1,r=nums.length-1;
//            while (l<r){
//                int sum=nums[i]+nums[l]+nums[r];
//                if (sum==0){
//                    ArrayList<Integer> path=new ArrayList<>();
//                    path.add(nums[i]);
//                    path.add(nums[l]);
//                    path.add(nums[r]);
//                    if (!res.contains(path)){
//                        res.add(path);
//                    }
//                }
//                if (sum<0){
//                    l++;
//                }else {
//                    r--;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i>0&&nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> path = Arrays.asList(nums[i], nums[l], nums[r]);
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
                    if (sum < 0) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        //-4 -4 -3 -2 -1 0 2
        int[] nums = {0, -4, -1, -4, -2, -3,0, 2};
        List<List<Integer>> lists = new ThreeSum().threeSum(nums);
        System.out.print(lists.size());
    }
}
