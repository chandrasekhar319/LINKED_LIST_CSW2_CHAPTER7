package CHAPTER_4_LINKED_LIST;

public class DELETE_NODE {
	public static void delete(ListNode<Integer> node) {
		node.data=node.next.data;
		node.next=node.next.next;
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
		for(int i=9;i>=0;i--)
			l1=insert(i+1,l1);
		display(l1);
		System.out.println("\n");
		int n=5;
		ListNode<Integer> temp=l1;
		for(int i=1;i<n;i++)
			temp=temp.next;
		delete(temp);
		System.out.println("After Deletion : ");
		display(l1);

	}

}
