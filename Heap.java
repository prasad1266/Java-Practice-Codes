class Heap{
	
	void hepify(int []arr, int n, int i){
	int largest = i;
	int l = 2*i +1;
	int r =2*i +2;
	
	if(l < n && arr[l] > arr[largest]){
	largest = l;
		}
	if(r < n && arr[r] >arr[largest]){
	largest = r;
		}
		
		if(largest != i){
		int temp =arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
		hepify(arr, n, largest);
		
		}
		
	}
	void heapSort(int arr[]){
	
	int n = arr.length;
	for(int i=n/2-1; i >=0; i--){  
	hepify(arr, n,i);
		}
		
		for(int i=n-1; i>0; i--){
		int temp = arr[0];
		arr[0] = arr[i];
		arr[i] = temp;
		hepify(arr, i ,0);
		}
	}
	
	void display(int arr[]){
	int n =arr.length;
	for(int i=0; i<n; i++){
	System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String args[]){
	
	Heap hp = new Heap();
	int arr[] = {30,20,50,80,70};
	hp.display(arr);
	hp.heapSort(arr);
	System.out.println("\n Sorted array \n");
	hp.display(arr);
	
	}

}