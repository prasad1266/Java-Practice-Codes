class QuickSort{
	
	static void quickSort(int arr[], int low,int high){
		if(low < high){
			
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
			
		}	
	}
	
	static int partition(int arr[],int low, int high){
		
		int pivot = arr[low];
		int i= low;
		int j = high;
		
		while(low < high)
		{
				while(arr[i]<=pivot){
					i++;
				}
				while(arr[j]> pivot){
					j--;
				}
				if(i<j){
					swap(arr,i,j);
				}
				
		}
		swap(arr,j,low);
		return j;
	}
	
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void display(int arr[]){
		for(int i =0;i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String []args){
	
	QuickSort qs = new QuickSort();
	  int arr[] = {15,45,14,36,84,55,31,9};
	  int n = arr.length;
	  
	  quickSort(arr,0,n-1);
	display(arr);
	
	}
}