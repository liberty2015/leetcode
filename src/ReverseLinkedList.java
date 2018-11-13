/**
 * Created by Administrator on 2018/11/13.
 */

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 206. 反转链表
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode prev=null,current,next;
        current=head;
        next=current.next;
        while (current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if (current!=null)
                next=next.next;
        }
        head=prev;
        return head;
    }
}
