//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
//
// 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
//
//与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
//
//

package array;

import java.util.Arrays;

public class ThreeSumClosed {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3){
            return Integer.MIN_VALUE;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;//记录距离目标值的最小距离 绝对值
        int temp = Integer.MIN_VALUE;//临时变量 记录三数之和
        int abs = Integer.MAX_VALUE;//记录每次距离目标值的 绝对值
        int sum = Integer.MIN_VALUE;//记录最小的三数之和

        for (int i = 0; i < nums.length-2; i++) {
            temp = nums[i] + nums[i+1] + nums[i+2];
            abs = Math.abs(target - temp);
            if(abs < min){
                min = abs;
                sum = temp;
            }
        }
        return sum;
        
    }
}
