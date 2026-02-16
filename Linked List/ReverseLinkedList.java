// Problem: 206. Reverse Linked List
// Platform: LeetCode / DSA Practice
// Description: Reverse a singly linked list using a Stack.
// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;

        Stack<Integer> st = new Stack<>();
        ListNode curr = head;

        
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        
        ListNode newHead = new ListNode(st.pop());
        ListNode temp = newHead;

        while (!st.isEmpty()) {
            temp.next = new ListNode(st.pop());
            temp = temp.next;
        }

        return newHead;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: number of nodes
        int n = sc.nextInt();

        // Input: linked list values
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        // Output reversed list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();
    }
}
