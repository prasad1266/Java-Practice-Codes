class InsertionSort{

static int min;

		static void isSort(int arr[]){				//	10,15,11,23,7,45
			int n= arr.length;
			for(int i=0; i<n; i++){
				int key = arr[i];
				int j = i-1;
				while( j>=0 && arr[j] > key){
				
				arr[j+1] = arr[j];
				j = j-1;
				}
				arr[j+1] = key;
			}
		}

		static void display(int arr[]){
		for(int i=0; i<arr.length; i++){
		System.out.println(arr[i] +" ");

		}
	}


	public static void main(String args[]){
	
		InsertionSort is = new InsertionSort();
	int arr[] = {10,27,17,13,56,15,78,61};                                                                                                    
	int n =arr.length;
	
	isSort(arr);
	display(arr);
	
	
	}
}




