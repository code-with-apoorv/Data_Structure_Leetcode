/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // First we copy the value of next node in current node
        // The next node is curr.next.next
        node.val = node.next.val;
        node.next = node.next.next;
    }
}