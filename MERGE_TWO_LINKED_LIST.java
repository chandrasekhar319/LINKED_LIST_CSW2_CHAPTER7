package CHAPTER_4_LINKED_LIST;


public class MERGE_TWO_LINKED_LIST {
	static ListNode<Integer> head;
	public static ListNode <Integer> mergeTwoSortedLists(ListNode<Integer> L1,
			ListNode<Integer> L2) {
			// Creates a placeholder for the result.
			ListNode <Integer> dummyHead = new ListNode<>(null);
			ListNode <Integer> current = dummyHead;
			ListNode <Integer> pi = L1 , p2 = L2 ;
			while (pi != null && p2 != null) {
				if (pi.data <= p2.data)
				{
				current.next = pi;
				pi = pi.next ;
				}else {
				current.next = p2 ;
				p2 = p2.next ;
				}
				current = current.next ;
				}
				current.next = pi != null ? pi : p2 ;
				return dummyHead.next ;
	}
	
	public static ListNode insert(int d,ListNode head) {
		ListNode<Integer> newNode=new ListNode<>(d);
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	
    public static void display(ListNode node) {
    	while(node!=null)
    	{
    		System.out.print("--->"+node.data);
    		node=node.next;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LinkedList 1: ");
		ListNode<Integer> l1=new ListNode<Integer>(0);
		for(int i=5;i>0;i--)
			l1=insert(i+2,l1);
		display(l1);
		System.out.println("\n");
		System.out.println("LinkedList 2: ");
		ListNode<Integer> l2=new ListNode<Integer>(1);
		for(int i=10;i>5;i--)
			l2=insert(i+3,l2);
		display(l2);
		System.out.println("\n");
		System.out.println("After merging ,The LinkedList is : ");
		ListNode<Integer> l3=new ListNode<Integer>(null);
		l3=mergeTwoSortedLists(l1,l2);
		display(l3);

	}

}
