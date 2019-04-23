//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
//
// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
//
// 必须原地修改，只允许使用额外常数空间。
//
// 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1
//
package array;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int h = nums.length - 1;
        int temp = 0;
        while (h>0 && nums[h] <= nums[h-1]) h--;
        if(h>0){
            int j = nums.length-1;
            while (j>0 && nums[j] <= nums[h]) j--;
            temp = nums[h];
            nums[h] = nums[j];
            nums[j] = temp;
        }
        if(h == 1){
            Arrays.sort(nums);
        }
    }
}
