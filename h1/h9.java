package day04;

public class h9 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {

            // 找到将要翻转的链表的最后一个节点
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }

            // 设置翻转链表的头和尾，生成一个子链表
            ListNode start = pre.next;
            ListNode next = end.next;//保存下一段子链表的头节点
            end.next = null;

            // 翻转链表并将其连接上原链表
            pre.next = reverse(start);
            start.next = next;//原来的头节点变为末端节点，从而连接下一段子链表

            // 将pre和end指针指向子链表的最后一个节点
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        // 反转链表的链表头
        ListNode newHead = null;
        ListNode next = null;
        while (head != null) {
            // 找到下一个节点
            next = head.next;
            // 更改当前节点的next指针指向其上一个节点（上一次循环保存的newHead)
            head.next = newHead;
            // 更改反转链表的链表头
            newHead = head;
            // 移动到下一个节点
            head = next;
        }
        return newHead;
    }
}