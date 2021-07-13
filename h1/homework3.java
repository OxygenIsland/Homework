package com.homework;
public class homework3 {//public修饰类只能加一个，要加也只能加在于文件名相同的类的前面

    public static void main(String[] args) {
        Solution example1 = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        example1.add(l1);
        example1.add(l2);
        example1.add(l3);
        example1.add(l4);
        example1.add(l5);
        System.out.printf("\n未处理的链表为");
        example1.show();
        System.out.printf("\n处理后的链表为");
        example1.delete(l2);
        example1.show();
    }


}
class Solution{
    private ListNode head = new ListNode(0);
    //增加链表
    public void add(ListNode listNode){
        ListNode temp = head;
        while (true){
            if (temp.next == null) {
                break;
            }
            temp=temp.next;
        }
        temp.next = listNode;
    }
    //显示链表
    public void show(){
        if (head == null) {
            System.out.printf("链表为空");
            return;
        }
        ListNode temp=head;
        while (true){
            if(temp==null){
                break;
            }
            System.out.println(temp.toString());
            temp=temp.next;
        }
    }

    //删除链表
    public void delete(ListNode listNode) {
        if (head.next == null) {
            System.out.printf("链表为空");
            return;
        }
        ListNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next==listNode){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }else {
            System.out.printf("删除的节点不存在");
        }
    }
}
class ListNode{
    int val;
    ListNode next;
    //构造器
    ListNode(int x){
        this.val = x;
    }
    public String toString() {
        return "值："+val;
    }

}