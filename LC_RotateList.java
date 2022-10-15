Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Jayash-Gupta 
mradulvarshney
/
LeetCode
Public
Code
Issues
Pull requests
Actions
Projects
Security
Insights
LeetCode/Medium/61. Rotate List
@mradulvarshney
mradulvarshney Create 61. Rotate List
Latest commit 9313eca on Sep 15
 History
 1 contributor
50 lines (48 sloc)  1.07 KB

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
class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null)
            return head;
        int size=0;
        ListNode tail = head;
        while(tail!=null)
        {
            tail=tail.next;
            size++;
        }
        k = k % size;
       
        ListNode node = head;
        ListNode n = null;
        while(head.next != null && k!=0)
        {
            if(head.next.next == null)
            {
                n = head;
                head = head.next;
            }
            if(head.next == null)
            {
                head.next = node;
                n.next = null;
                node = head;
                k--;
            }
            else
            {
                head = head.next;
            }
        }
        
        return node;
    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
LeetCode/61. Rotate List at main · mradulvarshney/LeetCode
