class MaxMin{
int arr[] = {10,20,30,40,5,60,80};
int max=0;
int min=arr[0];
void max(){
for(int i=0; i<arr.length; i++){
   if(arr[i]>max){
max=arr[i];
	}
   }
System.out.println("Max Element in array is :"+max);

}
void min(){
	for(int i=0; i<arr.length; i++){
   if(arr[i]<min){
   min=arr[i];
	}
   }
System.out.println("Minimum Element in array is :"+min);
} 
  public static void main(String[] args){
	MaxMin obj = new MaxMin();
	obj.max();
	obj.min();

	}
  }