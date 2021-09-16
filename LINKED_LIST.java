package CHAPTER_4_LINKED_LIST;

 class NODE{
	int data;
	NODE next;
    NODE(int d)
	{
		data=d;
	}
}
public class LINKED_LIST {
	static NODE head=null;
public static void traverse() {
	NODE n=head;
	System.out.print("LINKED LIST :");
	while(n!=null)
	{
		System.out.print("--->"+n.data);
		n=n.next;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LINKED_LIST l=new LINKED_LIST();
		l.head=new NODE(1);
		NODE second=new NODE(2);
		NODE third=new NODE(3);
		NODE fourth=new NODE(4);
		l.head.next=second;
		second.next=third;
		third.next=fourth;
		l.traverse();

	}

}
