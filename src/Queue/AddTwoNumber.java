//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
//
//

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

package Queue;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        int atend = 0;
        int sum = 0;
        ListNode ln, ls = new ListNode(0);
        ln = ls;
        while (l1 != null || l2 != null || atend != 0) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + atend;
            atend = sum / 10;
            temp = sum % 10;

            ln.next = new ListNode(temp);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            ln = ln.next;
        }
        return ls.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
