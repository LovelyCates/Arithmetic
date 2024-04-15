/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        // 快慢指针，慢指针能与快指针相遇，一定有环
        ListNode slow = head, fast = head.next.next;

        while (fast != null && fast.next != null) {
            
            if (fast == slow) {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;

        }
        return false;
    }
}
// @lc code=end

