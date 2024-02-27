class MergeSortDemo{

	static void mergeSort(int arr[], int l, int h){
		if(l<h){
		{															//10 , 27 , 17, 13, 56, 15, 78, 61
			int mid = (l+(h-l))/2;
			mergeSort(arr,l,mid);					//left prob
			mergeSort(arr,mid+1,h);					//right prob
			
			merge(arr,l,mid,h);
				}
		}
	}
	static void merge(int arr[],int l,int mid,int h){
		
		int n1 = mid-l+1;
		int n2 = h-mid;
		
		int L[] =  new int [n1];
		int R[] =  new int [n2];
		
		//Shift elements to left  array
		
		for(int i=0; i<n1; i++){
		L[i] = arr[l+1];
		}
															//10 , 27 , 17, 13,        56, 15, 78, 61
		//Shift elements to right  array
		
		for(int j=0; j<n2; j++){
		R[j] = arr [mid+1+j];
		
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2){
		if(L[i] <= R[j]){
		arr[k] =L[i];
		i++;
		}
		else{
			arr[k] =R[i];
			j++;
		}
		k++;
		}
			
		while(i<n1){
		arr[k] = L[i];
		i++;
		k++;
	          }
		while(i<n2){
		arr[k] = R[j];
		j++;
		k++;
		}
	}

static void display(int arr[]){
for(int i=0; i<arr.length; i++){
System.out.println(arr[i] +" ");

	}
}
	public static void main(String[] args){
	
	MergeSortDemo ms = new MergeSortDemo();
	int arr[] = {10,27,17,13,56,15,78,61 };
	int n =arr.length;
	
	mergeSort(arr,0,n-1);                                                       
	display(arr);
	
	

	}
}                     