class Queue{
	int size =5;
	int Q[] = new int[size];
	int rear, front ;							 // 5 10 15 20 25
	
	Queue(){
	front = rear =-1;
	}
	
	boolean isEmpty(){
	
	if(front == -1 && rear == -1)
	{return true;
	}
	return false;
	}
	
	boolean isFull(){
	
	if(front == 0 && rear == size-1){
			
	return true;
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
				rear++;
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
			if(front > rear)
			{
			front = -1;
			rear = -1;
			}
			else{
			front++;
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
	public static void main(String[] args){
		Queue qu = new Queue();
			System.out.println("Is Queue Empty : "+qu.isEmpty());
			qu.enqueue(5);
			qu.enqueue(10);
			qu.enqueue(15);
			qu.enqueue(20);
			qu.enqueue(25);
			System.out.println();
			qu.display();
			
	}
}