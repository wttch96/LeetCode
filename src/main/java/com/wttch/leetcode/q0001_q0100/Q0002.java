package com.wttch.leetcode.q0001_q0100;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * <p>请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * <p>你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wttch
 */
public class Q0002 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode root = new ListNode(0);
    ListNode cursor = root;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int l1Val = l1 != null ? l1.val : 0;
      int l2Val = l2 != null ? l2.val : 0;
      int sumVal = l1Val + l2Val + carry;
      carry = sumVal / 10;

      ListNode sumNode = new ListNode(sumVal % 10);
      cursor.next = sumNode;
      cursor = sumNode;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }

    return root.next;
  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
