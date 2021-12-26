public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0,head);
        ListNode slow = newHead;
        ListNode fast = newHead;
        for(int i=0;i<=n;i++)
        {
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next=slow.next.next;
        return newHead.next;
    }
