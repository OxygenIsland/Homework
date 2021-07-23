package day06;

public class h12 {
}
class Solution2 {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }
    //该递归函数的宏观语义：将left、right接到节点root上
    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left, mid);
        root.right = buildTree(mid.next, right);
        return root;
    }
    //找出链表中位数节点的方法多种多样，其中较为简单的一种是「快慢指针法」。
    // 初始时，快指针fast和慢指针slow均指向链表的左端点left。
    // 我们将快指针fast 向右移动两次的同时，将慢指针slow 向右移动一次，
    // 直到快指针到达边界（即快指针到达右端点或快指针的下一个节点是右端点）。此时，慢指针对应的元素就是中位数。
    public ListNode getMedian(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}