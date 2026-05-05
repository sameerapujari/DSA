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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int n=1;
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
            n++;
        }
        k = k%n; //normalize
       if(k==0) return head;

       curr.next = head;  //circularr ll
       
       ListNode tail = head;
       for(int i=1; i<n-k; i++){
            tail = tail.next;
       }
       ListNode newHead = tail.next;
       tail.next=null;
       return newHead;
    }
}