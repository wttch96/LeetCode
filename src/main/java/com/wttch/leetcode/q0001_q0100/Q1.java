package com.wttch.leetcode.q0001_q0100;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例1
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例2
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例3
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * @author wttch
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        // 建立k-v ，一一对应的哈希表
        var hash = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexes[0] = i;
                indexes[1] = hash.get(nums[i]);
                return indexes;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }
        return indexes;
    }
}
