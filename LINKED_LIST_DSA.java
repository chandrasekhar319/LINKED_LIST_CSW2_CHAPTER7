package CHAPTER_4_LINKED_LIST;

import java.util.*;

class link{
	int info;
	link next;
}
public class LINKED_LIST_DSA{
	static link start=null;
	public static void create(link node) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of node : ");
		node.info=sc.nextInt();
		node.next=null;
		System.out.println("Enter 0 to exit or any number key to continue : ");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			link temp=new link();
			System.out.println("Enter the value of temp node : ");
			temp.info=sc.nextInt();
			temp.next=null;
			node.next=temp;
			node=temp;
			System.out.println("Enter 0 to exit or any number key to continue : ");
			ch=sc.nextInt();
		}
	}
	public static void display(link node) {
		System.out.print("LINKED LIST :");
		while(node!=null)
		{
			System.out.print("---->"+node.info);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		link node=new link();
		start=node;
		create(start);
		display(start);

	}

}
