package CHAPTER_4_LINKED_LIST;

public class LINKED_LIST_PIVOTING {
	public static ListNode<Integer> listPivoting (ListNode <Integer > L, int x) {
		ListNode<Integer > lessHead = new ListNode <> ( null);
		ListNode<Integer > equalHead = new ListNode <> ( null);
		ListNode<Integer > greaterHead = new ListNode <> ( null);
		ListNode <Integer> lesslter = lessHead;
		ListNode <Integer> equallter = equalHead;
		ListNode <Integer> greaterlter = greaterHead;
		// Populates the three lists.
		ListNode <Integer> iter = L;
		while (iter != null) {
		if (iter.data < x) {
		lesslter . next = iter;
		lesslter = iter;
		} else if (iter.data == x) {
		equallter . next = iter;
		equallter = iter;
		} else { // iter.data > x.
		greaterlter . next = iter;
		greaterlter = iter;
		}
		iter = iter . next ;
		}// Combines the three lists.
		greaterlter . next = null;
		equallter . next = greaterHead . next ;
		lesslter . next = equalHead . next ;
		return lessHead . next ;
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
		System.out.println("LinkedList is : ");
		ListNode<Integer> l1=new ListNode<Integer>(3);
		ListNode<Integer> l2=new ListNode<Integer>(2);
		ListNode<Integer> l3=new ListNode<Integer>(2);
		ListNode<Integer> l4=new ListNode<Integer>(11);
		ListNode<Integer> l5=new ListNode<Integer>(7);
		ListNode<Integer> l6=new ListNode<Integer>(5);
		ListNode<Integer> l7=new ListNode<Integer>(11);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;
		display(l1);
		int x=11;
		listPivoting(l1,x);
		System.out.println("\nAfter pivoting : ");
		display(l1);

	}

}
