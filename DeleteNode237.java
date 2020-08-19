/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNode237 {
    public void deleteNode(ListNode node) {
        
        int nodeVal = node.next.val;
        node.val = nodeVal;
        ListNode tmp = node.next;
        node.next = node.next.next;
        tmp.next = null;
        
    }
}
