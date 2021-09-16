package CHAPTER_4_LINKED_LIST;

public class REMOVE_KTH_ELEMENT {
	public static ListNode<Integer> removeKthLastNode(ListNode <Integer> L, int k) {
		ListNode <Integer> dummy = new ListNode<>(0);
		dummy.next=L;
		ListNode <Integer> first = dummy.next ;
		while (k-- > 0) {
		first = first.next;
		}
		ListNode <Integer> second = dummy;
		while (first != null) {
			second = second. next;
			first = first.next;
			}
			second. next = second . next . next ;
			return dummy.next ;
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
		ListNode<Integer> l2=new ListNode<Integer>(1);
		ListNode<Integer> l3=new ListNode<Integer>(3);
		ListNode<Integer> l4=new ListNode<Integer>(5);
		ListNode<Integer> l5=new ListNode<Integer>(7);
		ListNode<Integer> l6=new ListNode<Integer>(22);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;
		display(l1);
		int pos=5;
		removeKthLastNode(l1,pos);
		System.out.println("\nAfter Deletion : ");
		display(l1);
		

	}

}
