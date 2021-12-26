public ListNode reverseList(ListNode head) {
        ListNode dummy = head;
        ListNode prev = null;
        ListNode reverse = null;
        
        int counter = 0;
        while(head!=null)
        {
            counter++;
            head=head.next;
        }
        while(dummy!=null)
        {
            ListNode next  = dummy.next;
            if(next==null)
            {
                reverse = dummy;
            }
            dummy.next = prev;
            prev = dummy;
            dummy = next;
        }
        System.out.println(counter);
        return reverse;
    }
