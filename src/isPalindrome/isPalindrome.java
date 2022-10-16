package isPalindrome;

import java.util.Stack;

public class isPalindrome {
    /**
     * 234. Palindrome Linked List
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        ListNode next = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<>();

        while (next != null) {
            stack.push(next.val);
            next = next.next;
        }

        while (head != null) {
            int i = stack.pop();
            if (head.val == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.next;
        }

        return ispalin;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
