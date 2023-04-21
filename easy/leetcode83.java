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
    public ListNode deleteDuplicates(ListNode head) {
        // Initialize a runner pointer to traverse the linked list
        ListNode runner = head;
        
        // Traverse the linked list until the runner pointer reaches the end or the second to last node
        while (runner != null && runner.next != null){
            // If the current node's value is equal to the next node's value, skip the next node by setting the current node's next pointer to the node after the next node
            if(runner.val == runner.next.val)
                runner.next = runner.next.next;
            else
                // If the current node's value is not equal to the next node's value, move the runner pointer to the next node
                runner = runner.next;
        }
        
        // Return the head of the modified linked list
        return head;
    }
}
