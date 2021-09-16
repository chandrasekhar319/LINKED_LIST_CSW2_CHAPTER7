package CHAPTER_4_LINKED_LIST;

public class LINKED_LIST_REVERSE {
	public static  ListNode<Integer> reverseList( ListNode<Integer> head)
	{
		ListNode<Integer> prev=null,next=null;
		ListNode<Integer> current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}

}
