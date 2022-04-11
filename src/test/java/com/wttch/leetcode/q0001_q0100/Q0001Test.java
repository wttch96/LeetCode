package com.wttch.leetcode.q0001_q0100;

import com.wttch.leetcode.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Q0001Test extends TestBase<Q0001> {

  @Test
  void test() {
    Assertions.assertArrayEquals(
        new int[] {0, 1},
        Arrays.stream(solution().twoSum(new int[] {2, 7, 11, 15}, 9)).sorted().toArray());
    Assertions.assertArrayEquals(
        new int[] {1, 2},
        Arrays.stream(solution().twoSum(new int[] {3, 2, 4}, 6)).sorted().toArray());
    Assertions.assertArrayEquals(
        new int[] {0, 1}, Arrays.stream(solution().twoSum(new int[] {3, 3}, 6)).sorted().toArray());
  }
}
