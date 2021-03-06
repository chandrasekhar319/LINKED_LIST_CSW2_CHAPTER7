package CHAPTER_4_LINKED_LIST;

public class CYCLICITY_LINKED_LIST1 {
	public static ListNode <Integer> hasCycle(ListNode<Integer> head) {
		ListNode <Integer> fast = head, slow = head;
		while (fast != null && fast.next != null) {
		slow = slow.next;
		fast = fast.next.next ;
		if (slow == fast) {
		// There is a cycle, so now let?s calculate the cycle length.
		int cycleLen = 0;
		do {
		++cycleLen ;
		fast = fast.next ;
		} while (slow != fast);
		// Finds the start of the cycle.
		ListNode<Integer> cycleLenAdvancedlter = head;
		// cycleLenAdvancedlter pointer advances cycleLen first.
		while (cycleLen-- > 0) {
		cycleLenAdvancedlter = cycleLenAdvancedlter.next ;
		}
		ListNode<Integer> iter = head;
		// Both iterators advance in tandem.
		while (iter != cycleLenAdvancedlter) {
		iter = iter.next ;
		cycleLenAdvancedlter = cycleLenAdvancedlter.next ;
		}
		return iter; // iter is the start of cycle.
		}
		}
		return null;
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
		ListNode<Integer> l3=new ListNode<Integer>(8);
		ListNode<Integer> l4=new ListNode<Integer>(11);
		ListNode<Integer> l5=new ListNode<Integer>(7);
		ListNode<Integer> l6=new ListNode<Integer>(5);
		ListNode<Integer> l7=new ListNode<Integer>(11);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;
		display(l1);
		//l7.next=l3;
		ListNode<Integer> k=hasCycle(l1);
		System.out.println("\nAFTER CHECKING : ");
		if(k!=null)
			System.out.println("List has the cycle at :"+k.data);
		else System.out.println("List has NO cycle :"+k);

	}

}
