class SelectionSort{

static int min;

static void ssSort(int arr[]){
	for(int i=0; i<arr.length; i++){
	min = i;
	for(int j= i+1; j<arr.length;j++){
	if(arr[j]<arr[min]){
	min=j;
		}
		int temp =arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		}
	}	
}
static void display(int arr[]){
for(int i=0; i<arr.length; i++){
System.out.println(arr[i] +" ");

	}
}

	public static void main(String[] args){
	
	SelectionSort ss = new SelectionSort();
	int arr[] = {10,27,17,13,56,15,78,61};                                                                                                    };
	int n =arr.length;
	
	ssSort(arr);
	display(arr);
	
	
	}
}