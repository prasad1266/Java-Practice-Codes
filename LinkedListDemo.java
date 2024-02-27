class LinkedListDemo {
static class Node{
	int data;
	Node next;
Node(int d){
	data = d;
	next = null;
     		}
	}
static Node head;

static void printList(){

	Node p=head;
	System.out.print(" [");
	while(p!=null){
		System.out.print(" "+p.data+"-->");
		p = p.next;
			}                             

	System.out.print(" ]");
		}
static void insertBegin(int data){
	Node new_node = new Node(data);
	new_node.next=head;
	head = new_node;	
	
	

	}

public static void main(String[] args){
	LinkedListDemo lv = new LinkedListDemo();
	lv.head = new Node(5);
	Node p1= new Node(10);
	Node p2= new Node(15);
	Node p3= new Node(20);
	
	lv.head.next = p1;
	p1.next = p2;
	p2.next = p3;
	
	System.out.println("Display LinkeList : \n");
	printList();
	
	System.out.println("\n\nNew LikedList After Changing Head\n");
	lv.insertBegin(2);
	printList();
	}
}