package CHAPTER_4_LINKED_LIST;

public class REMOVE_DUPLICATE_LINKED_LIST {
	public static ListNode <Integer> removeDuplicates (ListNode <Integer> L) {
		ListNode <Integer> iter = L;
		while (iter != null) {
		// Uses nextDistinct to find the next distinct value.
		ListNode <Integer> nextDistinct = iter. next;
		while (nextDistinct != null && nextDistinct.data == iter.data) {
		nextDistinct = nextDistinct . next ;
		}
		iter.next = nextDistinct ;
		iter = nextDistinct;
		}
		return L;
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
		ListNode<Integer> l1=new ListNode<Integer>(0);
		ListNode<Integer> l2=new ListNode<Integer>(1);
		ListNode<Integer> l3=new ListNode<Integer>(3);
		ListNode<Integer> l4=new ListNode<Integer>(3);
		ListNode<Integer> l5=new ListNode<Integer>(7);
		ListNode<Integer> l6=new ListNode<Integer>(22);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;
		display(l1);
		removeDuplicates (l1);
		System.out.println("\nAfter Removing the Duplicates : ");
		display(l1);

	}

}
