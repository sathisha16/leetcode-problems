package array;

import java.util.Arrays;
import java.util.HashMap;

public class LC01 {
    public static void main(String[] args) {
        int[]  nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
        
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if(map.containsKey(val)) {
                ans[0] = map.get(val);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}