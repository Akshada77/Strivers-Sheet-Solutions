/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        
        //BruteForce-O(n*m)
        // while(headA!=null){
        //     ListNode curr=headB;
        //     while(curr!=null){
        //         if(curr==headA){
        //             return curr;
        //         }
        //         curr=curr.next;
        //     }
        //     headA=headA.next;
        // }
        // return null;

        //Optimised-O(n+m)
        ListNode a=headA;
        ListNode b=headB;

        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}