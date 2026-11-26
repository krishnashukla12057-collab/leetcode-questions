class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode res = head != null && head.next != null ? head.next : head;
        while(cur != null && cur.next != null) {
            System.out.println(cur.val);
            ListNode nextNext = cur.next.next;
            if(prev != null){
                 prev.next = cur.next;
            }
            prev = cur;
           
            cur.next.next = cur;
            cur.next = prev.next;
            cur.next = nextNext;
            cur = cur.next;
        }

        return res;
    }
}