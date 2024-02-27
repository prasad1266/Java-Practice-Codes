/*1. Given a stack with push(), pop(), and empty() operations, The task is to delete the middle element of it without using any additional data structure.

Input  : Stack[] = [1, 2, 3, 4, 5]
Output : Stack[] = [1, 2, 4, 5]

Input  : Stack[] = [1, 2, 3, 4, 5, 6]
Output : Stack[] = [1, 2, 4, 5, 6]*/


class StackExp{
	int arr[];
	int top;
	int size;
	int temp[];
		StackExp(int size){
			this.size = size;
		arr = new int [size];
		top =-1;
		}
		
		boolean isEmpty(){
		return(top < 0);
		
		}
		boolean isFull()
	{
		return (top == (size-1));
	}
		void pop(){
		
		if(isFull()){
		System.out.println("Overflow");
			}
			else{
			top--;
				}
		}
		
		void push(int x){
		if(isFull()){
				System.out.println("Overflow");
				}
				else{
				arr[++top] = x;
				}
			}
			void display(){
		System.out.print("[");
		for(int i=0; i<=top; i++){
		System.out.print(arr[i]+" ");
		
			}
			System.out.print("] ");
		}
		 void deleteMiddle() {
			        if (isEmpty()) {
			            System.out.println("Stack is empty");
			            return;
			        }

			        int mid = (top + 1) / 2;

			        for (int i = mid; i < top; i++) {
			            arr[i] = arr[i + 1];
			        }

			        top--;

			        
			    }
		
			public static void main(String[] args){
			StackExp st = new StackExp(5);
			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);
			st.push(5);
			System.out.println("Before Deletion : ");
			st.display();
			
			System.out.println("\n\nAfter Deletion : ");
			st.deleteMiddle();
			st.display();
		}	
}