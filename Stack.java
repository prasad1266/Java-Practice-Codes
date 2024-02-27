import java.util.*;
class Stack{
	static final int MAX =10;
	int top; 
	int stack[] = new int[MAX];
	
	Stack(){
	top = -1;
	
	}
	
	boolean isEmpty(){
	return (top < 0);
	}
	
	boolean push(int x){
	if(top >= (MAX-1)){
	System.out.println("OverFlow");
	return false;
		}
		else{
		stack[++top] = x;
		System.out.println("Element Pushed :"+x);
		return true;
		}
	}
	
	int pop(){
		if(top < 0){
		
		System.out.println("UnderFlow");
		return 0;
			}
			else{
			
			int x = stack[top];
			return x;
			
			}
	}
	public static void main (String [] args){
		
		Stack st = new Stack();
	/* 	System.out.println("Is Stack Empty  : "+st.isEmpty());
		
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		st.pop(); */
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
				System.out.println("Menu For Stack Operations : ");
				System.out.println("1 Push ");
				System.out.println("2 Pop");
				System.out.println("3.IsEmpty");
				System.out.println("4.Exit");
					System.out.println("Enter your choice : ");
					int choice = sc.nextInt();
					switch(choice){
						case 1 :
						System.out.println("Enter Element : ");
						int num = sc.nextInt();
						st.push(num);
						break;
						
						case 2:
						st.pop();
						break;
						
						case 3:
						System.out.println(st.isEmpty());
						break;
						
						case 4 :
							return;
							
						
		
						
					}
		}while(true);
	}
}