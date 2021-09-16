package CHAPTER_4_LINKED_LIST;

public class LINKED_LIST_PALLINDROME {
	public static boolean isLinkedListAPalindrome (ListNode <Integer> L) {
		if (L == null) {
		return true ;
		}
		ListNode <Integer> slow = L, fast = L;
		while (fast!=null && fast. next!=null) {
		fast = fast . next . next ;
		slow = slow . next ;
		}
		ListNode <Integer> firstHalflter = L;
		ListNode <Integer> secondHalfIter= reverseList(slow);
		while (secondHalfIter != null && firstHalflter != null) {
		if (secondHalfIter.data != firstHalflter.data) {
		return false ;
		}
		secondHalfIter = secondHalfIter.next ;
		firstHalflter = firstHalflter.next ;
		}
		return true ;
	}
	public static void display(ListNode node) {
    	while(node!=null)
    	{
    		System.out.print("--->"+node.data);
    		node=node.next;
    	}
    }
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LinkedList is : ");
		ListNode<Integer> l1=new ListNode<Integer>(0);
		ListNode<Integer> l2=new ListNode<Integer>(1);
		ListNode<Integer> l3=new ListNode<Integer>(3);
		ListNode<Integer> l4=new ListNode<Integer>(1);
		ListNode<Integer> l5=new ListNode<Integer>(0);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		display(l1);
		System.out.println("\n");
		boolean k=isLinkedListAPalindrome(l1);
		if(k)
		{
			System.out.println("The List is Pallindrome : "+k);
		}
		else System.out.println("The List is not Pallindrome : "+k);

	}

}
