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
class Solution {
    public ListNode Findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        //corner case
        if(head==null || head.next==null){
            return true;
        }
    //1)Find mid
    ListNode mid=Findmid(head);
    //2)Reverse half list
    ListNode curr=mid;
    ListNode prev=null;
    ListNode next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    //3)Check left vs right list
    ListNode left=head;
    ListNode right=prev;
    while(right!=null){
        if(left.val!=right.val){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
    }
}