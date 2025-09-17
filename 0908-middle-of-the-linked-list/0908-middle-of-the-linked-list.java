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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        ListNode ptr = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        size = size/2;    
        for(int i = 0;i<size;i++){
            ptr = ptr.next;
        }
        return ptr;
    }
}