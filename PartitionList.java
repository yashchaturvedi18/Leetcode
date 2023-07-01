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

//Approach : Create two separate lists with larger and lesser values and eventually link them
class PartitionList {
    public ListNode partition(ListNode head, int x) {

        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode leftTail = left;
        ListNode rightTail = right;
        while(head!=null){
            if(head.val<x){
                leftTail.next=head;
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = head;
                rightTail= rightTail.next;
            }
            head=head.next;
        }
        leftTail.next = right.next;
        rightTail.next = null;
        return left.next;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
