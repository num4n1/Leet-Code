public void deleteNode(ListNode node) {
        if(node == null)
        {
            return;
        }
        ListNode current_node = node;
        current_node.val = node.next.val;
        current_node.next = node.next.next;
        
    }
