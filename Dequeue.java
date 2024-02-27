    class Dequeue{
	
	int max =5;
	int arr[]; 
	int rear; 
	int front;
	
	Dequeue(int size){
	front =-1; 
	rear =-1;
	this.size = size;
	}
	 
	
	boolean isFull(){
	if((front == 0 && rear == size-1) || front == rear+1){
			
	return true;
	}
	
	}
	
	boolean isEmpty(){
	
	if(front == -1 && rear == -1)
	{return true;
	}
	return false;
	}
	
	void insertRear(int x){
	
	if(isFull()){
	System.out.println("Dequeue Is  Full.");
	return;
	}
	if(front == -1 && rear == -1){
	front = 0;
	rear = 0;         
	}
	
		}
		else if(rear = size-1){
		
		rear = 0;
		else
		{
		rear = rear+1; 
		}
		}
		arr[rear]= x;
	}
	
	
	void insertFront(int x){
	if(isFull()){
	System.out.println("Dequeue Is  Full.");
	return;
	}
	if(front == -1){
	front =0;
	rear =0;
		}
		else if(front ==0){
		front = size-1;
		else
		front = front-1; 
		
		}
		arr[front] = x;
	}
	
	

	
	public static void main(String[] args){
	
	
	
	
	}
}
	