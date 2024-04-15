/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
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
    public ListNode detectCycle(ListNode head) {
        
        // base case
        if (head == null || head.next == null) {
            return null;
        }

        // 快慢指针
        ListNode fast = head, slow = head;

        // 首先需要两者第一次相遇
        while (fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            // 有环一定一直循环
            if (fast == slow) {
                break;
            }


        }    

        // 判断有无环
        if (fast == null || fast.next == null) {
            return null;
        }

        // 有环，重置slow
        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
// @lc code=end

