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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int cs = 0;
        while(head != null){
            if(head.val == 0 && cs > 0){
                ListNode temp = new ListNode(cs);
                tail.next = temp;
                tail = temp;
                cs = 0;
            }else{
                cs += head.val;
            }
            head = head.next;
        }
        return dummy.next;
    }
}