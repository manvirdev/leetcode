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
   
   // This method takes two ListNode objects as input, representing two linked lists, 
   // and merges them into a single sorted linked list.
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   
      // Initialize the result and current pointers as null.
      ListNode result = null;
      ListNode current = result;

      // Loop through the lists while both lists have nodes.
      while(list1 != null && list2 != null){
      
         // If the value of the first list node is greater than the value of the second list node.
         if(list1.val > list2.val){
            
            // If the result pointer is null, point it to the second list node and set the current pointer to it.
            if(result == null){
               result = list2;
               current = result;
            }
            
            // If the result pointer is not null, set the next pointer of the current node to the second list node 
            // and set the current pointer to it.
            else{
               current.next = list2;
               current = current.next;
            }
            
            // Move the second list node to the next node.
            list2 = list2.next;
            
         }
         
         // If the value of the first list node is less than or equal to the value of the second list node.
         else{
            
            // If the result pointer is null, point it to the first list node and set the current pointer to it.
            if(result == null){
               result = list1;
               current = result;
            }
            
            // If the result pointer is not null, set the next pointer of the current node to the first list node 
            // and set the current pointer to it.
            else{
               current.next = list1;
               current = current.next;
            }
            
            // Move the first list node to the next node.
            list1 = list1.next;
         }
      }

      // If the first list has nodes remaining, append them to the result.
      if(list1 != null){
         if(result == null){
            result = list1;
         }
         else{
            current.next = list1;
         }
      }
      
      // If the second list has nodes remaining, append them to the result.
      else{
         if(result == null){
            result = list2;
         }
         else{
            current.next = list2;
         }
      }

      // Return the merged linked list.
      return result;
   }

}
