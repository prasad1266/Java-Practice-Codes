class CircularQueue{
	
	int size =5;
	int Q[] = new int[size];
	int rear; 
	int front;
	
	CircularQueue(){
	front =-1; 
	rear =-1;
	}
	
	boolean isFull(){
	if(front ==-1 && rear == -1){
	return true;
		}
	return false;
	}

	boolean isEmpty(){
	
	if(front == -1 && rear == -1)
	{return true;
	}
	return false;
	}
	
		void enqueue(int x)
	{
		if(isFull()){
		System.out.println("Queue Is Full..");
		
		}
		else{
			 if(front == -1){
				front =0;
				rear = (rear+1)% size;
				Q[rear] = x;
				System.out.println("Element Is Inserted : "+x);
				}
		}
	
	}
	
	int dequeue(int y)
	{
	if(isEmpty()){
	return -1 ;
	}
	else
	{
			 y= Q[front];
			if(front == rear)
			{
			front = -1;
			rear = -1;
			}
			else{
			front = (front+1) % size;
			}
			System.out.println("Deleted Element is : "+y);
			return y;
		}
	}
	
	void display(){
				for(int i=front; i<=rear; i++){
				System.out.println(Q[i]+ " ");
				}
	}
	
	public static void main(String args[]){
	
	CircularQueue cq = new CircularQueue();
	System.out.println("Is Queue Empty : "+cq.isEmpty());
			cq.enqueue(5);
			cq.enqueue(10);
			cq.enqueue(15);
			cq.enqueue(20);
			cq.enqueue(25);
			System.out.println();
			cq.display();
	
	
	}
}
	