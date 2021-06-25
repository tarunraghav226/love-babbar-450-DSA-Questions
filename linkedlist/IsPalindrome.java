package linkedlist;

public class IsPalindrome {
    boolean isPalindromeUtil(Node head, Node right)
{
    Node left = head;
 
    if (right == null)
        return true;
 
    boolean isp = isPalindromeUtil(head, right.next);
    if (isp == false)
        return false;
 
    boolean isp1 = (right.data == left.data);
 
    head = head.next;
 
    return isp1;
}
 
    boolean isPalindrome(Node head)
    {
        boolean result = isPalindromeUtil(head, head);
        return result;
    }
}
